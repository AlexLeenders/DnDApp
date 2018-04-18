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

        final TextView buttonResult = findViewById(R.id.buttonResults);
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
                buttonResult.setText(periodicCheck[d20]);
            }
        });

        Button doorSpaceButton = findViewById(R.id.spaceDoorButton);
        doorSpaceButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] spaceDoor = {"Passage Ahead", "Passage Ahead", "Passage Ahead", "Passage Ahead", "Passage 90° right",
                        "Passage 90° left", "Room", "Room", "Room", "Room",
                        "Room", "Room", "Room", "Room", "T junction",
                        "1 square x 1 square empty storage closet", "Hallways with a dead end", "Oddly shaped room", "Oddly shaped room", "Oddly shaped room"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                buttonResult.setText(spaceDoor[d20]);
            }
        });

        Button doorLocButton = findViewById(R.id.doorLocButton);
        doorLocButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"Left", "Right", "Ahead", "Ahead"};
                Random rand = new Random();
                int d20 = rand.nextInt(4);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });

        Button passageTurnsButton = findViewById(R.id.passageTurnsButton);
        passageTurnsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"90° Right", "90° Right", "90° Right", "90° Right", "90° Right",
                        "90° Right", "90° Left", "90° Left", "90° Left", "90° Left",
                        "90° Left", "90° Left", "T junction", "T junction", "Dead end (roll for secret doors)", "Dead end (roll for secret doors)",
                        "Dead end (roll for secret doors)", "Passage becomes a special passageway", "Passage becomes a special passageway", "Passage becomes a special passageway"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });

        Button sidePassageButton = findViewById(R.id.sidePassageButton);
        sidePassageButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"Passage 90° Right", "Passage 90° Right", "Passage 90° Right", "Passage 90° Right", "Passage 90° Right",
                        "Passage 90° Right", "Passage 90° Left", "Passage 90° Left", "Passage 90° Left", "Passage 90° Left",
                        "Passage 90° Left", "Passage 90° Left", "+ junction", "Y junction", "T junction",
                        "T junction", "Special Passage", "Special Passage", "Special Passage", "Special Passage"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });

        Button specialPassageButton = findViewById(R.id.specialPassageButton);
        specialPassageButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"Stairs up to a gallery overlooking a room", "Stairs up to a gallery overlooking a room", "Stairs up to a gallery overlooking a room", "Stairs up to a gallery overlooking a room", "Stairs up to a gallery overlooking a room",
                        "Stairs up to a gallery overlooking a room", "River", "River", "River", "River",
                        "Stream (+ junction)", "Stream (+ junction)", "Double width passageway", "Double width passageway", "Double width passageway",
                        "Double width passageway", "Double width passageway", "Chasm", "Chasm", "Chasm"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });

        Button roomSizeButton = findViewById(R.id.roomSizeButton);
        roomSizeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"2 squares x 2 squares", "3 squares x 3 squares", "3 squares x 3 squares", "4 squares x 4 squares", "4 squares x 4 squares",
                        "5 squares x 5 squares", "5 squares x 5 squares", "6 squares x 6 squares", "6 squares x 6 squares", "7 squares x 7 squares",
                        "2 squares x 4 squares", "2 squares x 5 squares", "3 squares x 4 squares", "3 squares x 5 squares", "3 squares x 6 squares",
                        "4 squares x 5 squares", "5 squares x 7 squares", "6 squares x 8 squares", "Oddly Shaped Room", "Oddly Shaped Room"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });

        Button oddlyShapedButton = findViewById(R.id.oddlyShapedRoomButton);
        oddlyShapedButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"Circular", "Circular", "Triangular", "Triangular", "Octagonal",
                        "Octagonal", "Pentagonal", "Oval", "Cave", "Roll again + pool"};
                Random rand = new Random();
                int d20 = rand.nextInt(10);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });

        Button oddlyShapedSizeButton = findViewById(R.id.oddlyShapedSizeButton);
        oddlyShapedSizeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"200 square feet", "200 square feet", "350 square feet", "350 square feet", "500 square feet",
                        "500 square feet", "750 square feet", "1000 square feet", "1500 square feet", "100 square feet for every cleared room"};
                Random rand = new Random();
                int d20 = rand.nextInt(10);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });

        Button roomContents = findViewById(R.id.roomContentsButton);
        roomContents.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"Empty", "Empty", "Empty", "Empty", "Empty",
                        "Empty", "Monster", "Monster", "Monster", "Monster + Treasure",
                        "Monster + Treasure", "Monster + Treasure", "Monster + Treasure", "Monster + Treasure", "Monster + Treasure",
                        "Monster + Treasure", "Monster + Treasure", "Treasure", "Monster + Treasure + Trap", "Trap"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });

        Button numberOfExits = findViewById(R.id.numberExitsButton);
        numberOfExits.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"1 exit", "1 exit", "1 exit", "1 exit", "1 exit",
                        "2 exit", "2 exit", "2 exit", "3 exit", "4 exit"};
                Random rand = new Random();
                int d20 = rand.nextInt(10);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });

        Button trapTypeButton = findViewById(R.id.trapTypeButton);
        trapTypeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String[] doorLoc = {"Wall spikes (1d6)", "Wall spikes (1d6)", "Wall spikes (1d6)", "Wall spikes (1d10)", "Wall spikes (1d10)",
                        "Wall blades (1d8)", "Wall blades (1d8)", "Wall blades (1d8)", "Wall blades (1d12)", "Wall blades (1d12)",
                        "Pitfall trap (10' fall)", "Pitfall trap (10' fall)", "Pitfall trap (20' fall)", "Rockslide (2d8 dex check for half)", "Wall spears (1d4/level)",
                        "Camouflaged Quicksand", "Fiery pitch pour (2d4 + ignite combustibles)", "Fiery pitch pour (2d4 + ignite combustibles)", "Poison Gas (Save vs poison with +2 or die)", "Poison Gas (2d6 save for half + lose all strength bonuses)"};
                Random rand = new Random();
                int d20 = rand.nextInt(20);
                System.out.println(d20 + "***************************");
                buttonResult.setText(doorLoc[d20]);
            }
        });
    }


}