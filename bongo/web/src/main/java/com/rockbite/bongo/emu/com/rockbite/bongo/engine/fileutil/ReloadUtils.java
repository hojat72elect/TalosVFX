package com.rockbite.bongo.engine.fileutil;

import com.badlogic.gdx.files.FileHandle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReloadUtils {

    private static final Logger logger = LoggerFactory.getLogger(ReloadUtils.class);

    public static void registerFile(FileHandle handle, AutoReloadingListener listener) {
    }

    public static void dispose() {
    }

    public interface AutoReloadingListener {
        void onAutoReloadFileChanged();
    }
}
