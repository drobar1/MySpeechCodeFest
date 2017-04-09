package com.example.daniel.myspeechcodefest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Context;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import static com.example.daniel.myspeechcodefest.R.id.textView;

/**
 * Created by Ian on 4/8/2017.
 */

public class XmlStorageManager extends Activity {
    public void parseWords() {
        XmlPullParser parser = getXmlParser("words.xml");
        try
        {
            int eventType = parser.getEventType();

            while (eventType != XmlPullParser.END_DOCUMENT){
                String parserName;
                int tmpId = 0;
                switch (eventType){
                    case XmlPullParser.START_DOCUMENT:
                        break;
                    case XmlPullParser.START_TAG:
                        parserName = parser.getName();
                        if (parserName.equals("sound")){
                            tmpId = Integer.parseInt(parser.getAttributeValue(null,"id"));
                            WordManager.sounds.set(tmpId,new Sound(tmpId,parser.getAttributeValue(null,"name")));
                        } else if (WordManager.sounds.get(tmpId) != null){
                            if (parserName.equals("word")){
                                 WordManager.sounds.get(tmpId).addWord(parser.nextText());
                            }

                        }
                        break;
                    case XmlPullParser.END_TAG:
                        parserName = parser.getName();
                        if (parserName.equalsIgnoreCase("sound") && WordManager.sounds.get(tmpId) != null){
                            tmpId = Integer.parseInt(parser.getAttributeValue(null,"id"));
                            WordManager.sounds.set(tmpId,new Sound(tmpId,parser.getAttributeValue(null,"name")));
                        }
                }
                eventType = parser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private XmlPullParser getXmlParser(String filename){
        XmlPullParserFactory pullParserFactory;
        try {
            pullParserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = pullParserFactory.newPullParser();

            InputStream in_s = getApplicationContext().getAssets().open(filename);
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in_s, null);

            return parser;

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
        //
    }
}
