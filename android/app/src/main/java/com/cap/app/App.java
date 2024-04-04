package com.cap.app;

import android.app.Application;

import com.moengage.capacitor.MoEInitializer;
import com.moengage.core.LogLevel;
import com.moengage.core.MoEngage;
import com.moengage.core.config.LogConfig;
import com.moengage.core.model.SdkState;
import com.moengage.core.config.*;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MoEngage.Builder moEngage = new MoEngage.Builder(this, "8SIW681S80Z08KSHQFSTIZ8T");
        moEngage.configureLogs(new LogConfig(LogLevel.VERBOSE, true));
        moEngage.configureNotificationMetaData(new NotificationConfig(R.mipmap.ic_launcher, -1));
        MoEInitializer.initialiseDefaultInstance(this, moEngage);
    }
}
