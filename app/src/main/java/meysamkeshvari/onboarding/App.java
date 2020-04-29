package meysamkeshvari.onboarding;

import android.app.Application;
import meysamkeshvari.onboarding.utils.Prefs;

public class App extends Application {

    private Prefs prefs;
    private static App app;

    @Override
    public void onCreate() {
        super.onCreate();

        app = this;
        prefs = new Prefs(this);

    }

    public static App getApp() {
        return app;
    }

    public Prefs getPrefs() {
        return prefs;
    }

    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

}
