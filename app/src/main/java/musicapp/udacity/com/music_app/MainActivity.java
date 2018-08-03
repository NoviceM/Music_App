package musicapp.udacity.com.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView playButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Music1 ", "Unknown"));
        songs.add(new Song("Music2", "Unknown"));
        songs.add(new Song("Music3", "Unknown"));
        songs.add(new Song("Music4", "Unknown"));
        songs.add(new Song("Music5", "Unknown"));
        songs.add(new Song("Music6", "Unknown"));
        songs.add(new Song("Music7", "Unknown"));
        songs.add(new Song("Music8", "Unknown"));
        songs.add(new Song("Music9", "Unknown"));
        songs.add(new Song("Music10", "Unknown"));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

         ImageView playButton = (ImageView) findViewById(R.id.play_button);
         playButton.setOnClickListener(this);
    }
        @Override
        public void onClick(View view) {
            Intent currentSong = new Intent(MainActivity.this, CurrentSongPlaying.class);
            startActivity(currentSong);
        }


}
