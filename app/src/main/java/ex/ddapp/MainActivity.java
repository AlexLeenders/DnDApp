package ex.ddapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView randomPeriodic = findViewById(R.id.periodicResult);
        Button periodicButton = findViewById(R.id.periodicButton);
        periodicButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] periodicCheck = {"Continue Straight (3 squares)", "Continue Straight (3 squares)", "Continue Straight (5 squares)", "Door", "Door",
                        "Door", "Door", "Door", "Passage Turns", "Passage Turns",
                        "Side Passage", "Side Passage", "Open Room", "Open Room", "Open Room",
                        "Open Room", "Trap", "Dead End", "Wandering Monster", "Wandering Monster"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                randomPeriodic.setText(periodicCheck[d20]);
            }
        });

        final TextView randomDoorSpace = findViewById(R.id.spaceDoorResult);
        Button doorSpaceButton = findViewById(R.id.spaceDoorButton);
        doorSpaceButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] periodicCheck = {"Passage Ahead", "Passage Ahead", "Passage Ahead", "Passage Ahead", "Passage 90° right",
                        "Passage 90° left", "Room", "Room", "Room", "Room",
                        "Room", "Room", "Room", "Room", "T junction",
                        "1 square x 1 square empty storage closet", "Hallways with a dead end", "Oddly shaped room", "Oddly shaped room", "Oddly shaped room"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                randomDoorSpace.setText(periodicCheck[d20]);
            }
        });

        final TextView randomDoorLoc = findViewById(R.id.doorLocResult);
        Button doorSpaceLoc= findViewById(R.id.spaceDoorButton);
        doorSpaceButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] periodicCheck = {"Passage Ahead", "Passage Ahead", "Passage Ahead", "Passage Ahead", "Passage 90° right",
                        "Passage 90° left", "Room", "Room", "Room", "Room",
                        "Room", "Room", "Room", "Room", "T junction",
                        "1 square x 1 square empty storage closet", "Hallways with a dead end", "Oddly shaped room", "Oddly shaped room", "Oddly shaped room"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                randomDoorSpace.setText(periodicCheck[d20]);
            }
        });
    }


}
