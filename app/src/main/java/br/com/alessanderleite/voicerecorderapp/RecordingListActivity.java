package br.com.alessanderleite.voicerecorderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecordingListActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerViewRecording;
    private ArrayList<Recording> recordingArrayList;
    private RecordingAdapter recordingAdapter;
    private TextView textViewNoRecordings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recording_list);

        initViews();
    }

    private void initViews() {
        recordingArrayList = new ArrayList<>();

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Recording List");
        toolbar.setTitleTextColor(getResources().getColor(android.R.color.black));
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerViewRecording = (RecyclerView) findViewById(R.id.recyclerViewRecordings);
        recyclerViewRecording.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerViewRecording.setHasFixedSize(true);

        textViewNoRecordings = (TextView) findViewById(R.id.textViewNoRecordings);
    }
}
