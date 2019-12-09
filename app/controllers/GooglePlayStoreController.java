package controllers;

import dao.DbConnector;
import dto.BarPlaystore;
import dto.BarPlaystore2;
import dto.Data_playStore;
import io.ebean.SqlQuery;
import io.ebean.SqlRow;
import models.PlayStoreData;
import org.json.JSONArray;
import play.Logger;
import play.cache.SyncCacheApi;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.*;
import util.EbeanIssuingServer;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class GooglePlayStoreController extends Controller {
    private FormFactory formFactory;
    private SyncCacheApi cache;

    public Result showPage(Http.Request request){

// Complete DAtA

        List<PlayStoreData> fulldata = PlayStoreData.find.query().findList();
        List<Data_playStore> dataList= new ArrayList<>();
        for(PlayStoreData d : fulldata){
            Data_playStore play=new Data_playStore();
            play.setApp(d.getApp());
            play.setCategory(d.getCategory());
            play.setId(d.getId());
            dataList.add(play);
        }

        // Top Apps

        List<PlayStoreData> topData = PlayStoreData.find.query().where().raw("rating > 4.7").raw("reviews > 1200000").findList();
        List<Data_playStore> topdataList= new ArrayList<>();
        for(PlayStoreData d : topData){
            Data_playStore play=new Data_playStore();
            play.setApp(d.getApp());
            play.setCategory(d.getCategory());
            play.setId(d.getId());
            play.setRating(d.getRating());
            play.setReviews(d.getReviews());

            topdataList.add(play);
        }
        if (topdataList != null && topdataList.size() > 0 ) {
            return ok(views.html.data.render(topdataList, dataList));
        }

        else{return TODO();}
    }

    public Result contentRating(Http.Request request){
        List<SqlRow> datalist = DbConnector.createSqlQuery("SELECT ContentRating as contentRatings,sum(Installs) as installs from play_store_data  group by ContentRating").findList();
        List<BarPlaystore> barPlaystores = new ArrayList<>();

        for(SqlRow row : datalist){
            BarPlaystore playstore = new BarPlaystore();
            playstore.setName(row.getString("contentRatings"));
            playstore.setValue(row.getBigDecimal("installs"));
            barPlaystores.add(playstore);
        }

        BarPlaystore2 barPlaystore2 = new BarPlaystore2();

        for(BarPlaystore store : barPlaystores){
            barPlaystore2.getNames().add(store.getName());
            barPlaystore2.getValues().add(store.getValue());
        }

        Logger.info(Json.toJson(barPlaystore2).toString());
        return ok(Json.toJson(barPlaystore2));
    }
}