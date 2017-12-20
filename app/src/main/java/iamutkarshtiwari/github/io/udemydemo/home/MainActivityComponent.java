package iamutkarshtiwari.github.io.udemydemo.home;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import iamutkarshtiwari.github.io.udemydemo.di.ActivityScope;

/**
 * Created by utkarshtiwari on 03/12/17.
 */

@ActivityScope
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }
}
