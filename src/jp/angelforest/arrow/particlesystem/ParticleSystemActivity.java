package jp.angelforest.arrow.particlesystem;

import jp.arrow.angelforest.engine.core.AngelForestOpenGLActivity;

public class ParticleSystemActivity extends AngelForestOpenGLActivity {

    @Override
    protected void setRenderer() {
        renderer = new ParticleSystemRenderer(this);
    }

}