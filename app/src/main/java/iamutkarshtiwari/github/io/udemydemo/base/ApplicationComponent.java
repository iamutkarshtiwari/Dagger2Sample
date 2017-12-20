package iamutkarshtiwari.github.io.udemydemo.base;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by utkarshtiwari on 03/12/17.
 */

@Component(modules = {
        ApplicationModule.class,
})

@Singleton
public interface ApplicationComponent {
}
