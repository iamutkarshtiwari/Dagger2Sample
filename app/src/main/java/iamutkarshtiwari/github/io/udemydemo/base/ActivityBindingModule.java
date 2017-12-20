package iamutkarshtiwari.github.io.udemydemo.base;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import iamutkarshtiwari.github.io.udemydemo.home.MainActivity;
import iamutkarshtiwari.github.io.udemydemo.home.MainActivityComponent;

/**
 * Created by utkarshtiwari on 20/12/17.
 */

@Module(subcomponents = {
        MainActivityComponent.class,
})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder);

}
