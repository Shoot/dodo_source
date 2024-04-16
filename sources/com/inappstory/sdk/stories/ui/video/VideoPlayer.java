package com.inappstory.sdk.stories.ui.video;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.stories.cache.Downloader;
import com.inappstory.sdk.stories.cache.FileLoadProgressCallback;
import java.io.File;
import java.io.IOException;
/* loaded from: classes3.dex */
public class VideoPlayer extends TextureView implements TextureView.SurfaceTextureListener {
    File file;
    boolean isLoaded;
    boolean isMpPrepared;
    MediaPlayer mp;
    Surface surface;
    String url;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements MediaPlayer.OnPreparedListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            VideoPlayer.this.isMpPrepared = true;
            mediaPlayer.setLooping(true);
            VideoPlayer videoPlayer = VideoPlayer.this;
            videoPlayer.updateTextureViewSize(videoPlayer.getWidth(), VideoPlayer.this.getHeight(), mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
            mediaPlayer.setVolume(0.0f, 0.0f);
            mediaPlayer.start();
        }
    }

    public VideoPlayer(Context context) {
        super(context);
        this.file = null;
    }

    private void downloadCoverVideo(String str) {
        if (InAppStoryService.isNull()) {
            return;
        }
        Downloader.downloadFileBackground(str, false, InAppStoryService.getInstance().getFastCache(), new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTextureViewSize(float f, float f2, float f3, float f4) {
        float f5;
        float f6 = f / f2;
        float f7 = f3 / f4;
        float f8 = 1.0f;
        if (f3 / f > f4 / f2) {
            f8 = f7 / f6;
            f5 = 1.0f;
        } else {
            f5 = f6 / f7;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f8, f5, f / 2.0f, f2 / 2.0f);
        setTransform(matrix);
    }

    public void changePlayState() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.mp.pause();
            } else {
                this.mp.start();
            }
        }
    }

    public void destroy() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mp.reset();
            this.mp.release();
            this.mp = null;
        }
    }

    public void loadVideo(String str) {
        this.file = new File(str);
        this.isLoaded = true;
        if (isAvailable()) {
            prepareVideo(getSurfaceTexture());
        }
        setSurfaceTextureListener(this);
    }

    public void loadVideoByUrl(String str) {
        String str2 = this.url;
        if (str2 == null || !str2.equals(str)) {
            this.file = null;
        }
        this.url = str;
        this.isLoaded = true;
        if (isAvailable()) {
            prepareVideo(getSurfaceTexture());
        }
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.isMpPrepared = false;
        prepareVideo(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mp.reset();
            this.mp.release();
            this.mp = null;
            return false;
        }
        return false;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    public void pausePlay() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    public void prepareVideo(SurfaceTexture surfaceTexture) {
        this.surface = new Surface(surfaceTexture);
        if (this.mp == null) {
            this.mp = new MediaPlayer();
        }
        this.mp.setSurface(this.surface);
        try {
            if (this.file == null) {
                String str = this.url;
                if (str == null) {
                    return;
                }
                this.file = Downloader.getCoverVideo(str, InAppStoryService.getInstance().getFastCache());
            }
            File file = this.file;
            if (file != null && file.exists()) {
                File file2 = this.file;
                boolean renameTo = file2.renameTo(file2);
                if (this.file.length() > 10 && renameTo) {
                    this.mp.setDataSource(this.file.getAbsolutePath());
                    this.mp.prepareAsync();
                }
            } else {
                String str2 = this.url;
                if (str2 == null) {
                    return;
                }
                downloadCoverVideo(str2);
            }
            this.mp.setOnPreparedListener(new b());
        } catch (Exception e) {
            InAppStoryService.createExceptionLog(e);
            e.printStackTrace();
        }
    }

    public void release() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mp.reset();
            this.mp.release();
            this.mp = null;
        }
    }

    public boolean startPlay() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            this.mp.start();
            return true;
        }
        return false;
    }

    public void stopPlay() {
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public VideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.file = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements FileLoadProgressCallback {
        a() {
        }

        @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
        public void onSuccess(File file) {
            MediaPlayer mediaPlayer = VideoPlayer.this.mp;
            if (mediaPlayer == null) {
                return;
            }
            try {
                mediaPlayer.setDataSource(file.getAbsolutePath());
                VideoPlayer.this.mp.prepareAsync();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override // com.inappstory.sdk.stories.cache.FileLoadProgressCallback
        public void onError(String str) {
        }

        @Override // com.inappstory.sdk.utils.ProgressCallback
        public void onProgress(long j, long j2) {
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
