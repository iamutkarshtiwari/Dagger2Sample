package iamutkarshtiwari.github.io.udemydemo.base;

/**
 * Created by utkarshtiwari on 02/12/17.
 */
import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application application;

    ApplicationModule(Application app) {
        this.application = app;
    }


    @Provides
    Context provideApplicationContext() {
        return application;
    }


}
