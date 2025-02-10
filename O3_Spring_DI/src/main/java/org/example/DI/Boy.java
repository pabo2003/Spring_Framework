package org.example.DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Boy implements DI{
    @Autowired
    @Qualifier("girl")
    Aggrement girl;

    public Boy() {
    }
//Constructor injection
    public Boy(Aggrement girl) {
        this.girl = girl;
    }

    public void chatWithGirl(){
        girl.chat();
    }

    @Autowired
    @Override
    public void inject(Aggrement aggrement) {
        this.girl = aggrement;
    }
}
