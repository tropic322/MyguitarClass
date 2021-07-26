package com.example.myguitarclass;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.IBinder;

public class MusicPlayer extends Service {
   
    MediaPlayer player;
    public IBinder onBind(Intent arg0) {

        return null;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        player = MediaPlayer.create(this, R.raw.zero);// melody
        player.setLooping(true); //
        player.setVolume(100,100);
        player.start();

    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return START_NOT_STICKY;
    }

    public IBinder onUnBind(Intent arg0) {
        // TO DO Auto-generated method
        return null;
    }

    public void onStop() {
        player.pause();
    }
    public void onPause() {

    }
    @Override
    public void onDestroy() {
        player.stop();
        player.release();
    }

    @Override
    public void onLowMemory() {
        player.pause();
    }
}
