package iamutkarshtiwari.github.io.udemydemo.base;

import android.app.Application;

/**
 * Created by utkarshtiwari on 02/12/17.
 */

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

}
