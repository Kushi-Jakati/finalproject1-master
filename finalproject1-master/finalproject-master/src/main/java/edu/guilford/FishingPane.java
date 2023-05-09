package edu.guilford;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.transform.Translate;
import javafx.util.Duration;
import javafx.geometry.Bounds; 

public class FishingPane extends Pane {

        Scanner input = new Scanner(System.in);

        SeaCreatures seaCreature = new SeaCreatures();
        // File smallFish = new
        // File(FishingPane.class.getResource("/smallfish.png").toURI());
        // private ImageView smallFish;
        // private ImageView smallFish2;
        // private ImageView smallFish3;
        // private ImageView largeFish;
        // private ImageView largeFish2;
        // private ImageView woodenStick;
        // private ImageView octopus;

        // instantiate a line shape to be used as the fishing line
        private Line line;

        Random random = new Random();
        Timer timer;

        // declare a helpButton
        Button helpButton = new Button("Help");

        //declare a down and up button
        Button downButton = new Button("Down");
        Button upButton = new Button("Up");

        // declare a stopButton
        Button stopButton = new Button("Stop");

        // Constructor
        public FishingPane(SeaCreatures seaCreature) {
                this.seaCreature = seaCreature;

                int numOfSeaCreatures = 50;
        

                //instantiating the fisherman
                Fisherman fisherman = new Fisherman();
                fisherman.setPosition(fisherman.getXPosition(), fisherman.getYPosition());

                //instantiating the fishing line
                // line = new Line(fisherman.getXPosition() + 50, fisherman.getYPosition() + 50, fisherman.getXPosition() + 50,
                //                 fisherman.getYPosition() + 50);
                FishingLine fishingLine = new FishingLine();
                //fishingLine.transitionLineUpward();

                //create an array list of 9 random sea creatures
                ArrayList seaCreaturesArray = new ArrayList();
                for (int number = 0; number < numOfSeaCreatures; number++) {
                        SeaCreatures seaCreatureObject = new SeaCreatures();
                        seaCreaturesArray.add(seaCreatureObject);
                        this.getChildren().add(seaCreatureObject.getImage());
                }

                // iterate through the array list and use transition method to animate each sea
                // creature
                for (int number = 0; number < seaCreaturesArray.size(); number++) {
                        SeaCreatures seaCreatureObject = (SeaCreatures) seaCreaturesArray.get(number);
                        seaCreatureObject.transition(seaCreatureObject.getImage());
                        //set the transition to repeat forever
                        // seaCreatureObject.getTransition().setOnFinished(e -> {
                        //         //have the transition repeat forever
                        //         //remove the image from the pane and array list
                        //         this.getChildren().remove(seaCreatureObject.getImage());
                        //         //remove from the array list
                        //         //seaCreaturesArray.remove(seaCreatureObject);
                        //         //add a new random one to the pane and array list
                        //         SeaCreatures newSeaCreatureObject = new SeaCreatures();
                        //         //set all properties of the new sea creature to the old one
                        //         seaCreatureObject.setName(newSeaCreatureObject.getName());
                        //         seaCreatureObject.setPoints(newSeaCreatureObject.getPoints());
                        //         seaCreatureObject.setImage(newSeaCreatureObject.getImage());
                        //         seaCreatureObject.setTransition(newSeaCreatureObject.getTransition());
                        //         seaCreatureObject.transition(seaCreatureObject.getImage());
                        //         this.getChildren().add(seaCreatureObject.getImage());
                        //         //newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                        // });

                }


                //for loop for seaCreatures that once the transition is finished, it removes the image from the pane and the array list and adds a new random one
                //to the pane and array list. It keeps doing this every time the transition is finished for each object, so it is constantly adding and removing
                //objects from the pane and array list


                //get each element of the arraylist
                SeaCreatures seaCreature1 = (SeaCreatures) seaCreaturesArray.get(0);
                SeaCreatures seaCreature2 = (SeaCreatures) seaCreaturesArray.get(1);
                SeaCreatures seaCreature3 = (SeaCreatures) seaCreaturesArray.get(2);
                SeaCreatures seaCreature4 = (SeaCreatures) seaCreaturesArray.get(3);
                SeaCreatures seaCreature5 = (SeaCreatures) seaCreaturesArray.get(4);
                SeaCreatures seaCreature6 = (SeaCreatures) seaCreaturesArray.get(5);
                SeaCreatures seaCreature7 = (SeaCreatures) seaCreaturesArray.get(6);
                SeaCreatures seaCreature8 = (SeaCreatures) seaCreaturesArray.get(7);
                SeaCreatures seaCreature9 = (SeaCreatures) seaCreaturesArray.get(8);

                //create a small image based on a region of the original sea creature image
                //and only take the first third section of the image reading from left to right
                //and the second third section of the image reading from top to bottom

                //create a new image view for each sea creature
                // ImageView smallFish = (seaCreature1.getImage());
                // ImageView smallFish2 = (seaCreature2.getImage());
                // ImageView smallFish3 = (seaCreature3.getImage());
                // ImageView largeFish = (seaCreature4.getImage());
                // ImageView largeFish2 = (seaCreature5.getImage());
                
                // ImageView octopus = (seaCreature7.getImage());


                // //set the image view to the small image
                // smallFish.setViewport(new Rectangle2D(0, 0, 100, 100));
                
                // smallFish2.setViewport(new Rectangle2D(0, 0, 100, 100));
                // smallFish3.setViewport(new Rectangle2D(0, 0, 100, 100));
                // largeFish.setViewport(new Rectangle2D(0, 0, 100, 100));
                // largeFish2.setViewport(new Rectangle2D(0, 0, 100, 100));
            
                // octopus.setViewport(new Rectangle2D(0, 0, 100, 100));

                //Create a new imageview object for each new region using the rectangles that were created

                

                //event listener for each cycle of the transition


                //for each new cycle of the transition, have a new random sea creature appear and replace the attributes of the old one

                // //while loop for each sea creature that once the transition is finished, it removes the image from the pane and the array list and adds a new random one
                // //to the pane and array list. It keeps doing this every time the transition is finished for each object, so it is constantly adding and removing
                
                // //make this transition repeat forever
                // seaCreature1.getTransition().setOnFinished(e -> {
                //         //have the transition repeat forever
                //         //remove the image from the pane and array list
                //         //this.getChildren().remove(seaCreature1.getImage());
                //         //remove from the array list
                //         //seaCreaturesArray.remove(seaCreatureObject);
                //         //add a new random one to the pane and array list
                //         SeaCreatures newSeaCreatureObject = new SeaCreatures();
                //         //set all properties of the new sea creature to the old one
                //         seaCreature1.setName(newSeaCreatureObject.getName());
                //         seaCreature1.setPoints(newSeaCreatureObject.getPoints());
                //         seaCreature1.setImage(newSeaCreatureObject.getImage());
                //         seaCreature1.setTransition(newSeaCreatureObject.getTransition());
                //         seaCreature1.transition(seaCreature1.getImage());
                //         this.getChildren().add(seaCreature1.getImage());
                //         //newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // });

                //will do rest if the code above works



                System.out.println(seaCreature.getName());

                //add the fisherman to the pane
                this.getChildren().add(fisherman.getImage());
                //add the fishing line to the pane
                this.getChildren().add(fishingLine.getLine());

                //add that up and down buttons to the pane
                this.getChildren().add(upButton);
                this.getChildren().add(downButton);

                //place buttons to the far right middle of the pane
                upButton.setLayoutX(800);
                upButton.setLayoutY(250);
                downButton.setLayoutX(800);
                downButton.setLayoutY(300);

                System.out.println(seaCreature1.getName());
                //create an event listener for the up button that makes the line go up
                upButton.setOnAction(e -> {
                        fishingLine.transitionLineUpward();
                        //if the line touches the image of the sea creature, then the sea creature is caught and removed from the pane
                        //and array list for all the sea creatures in the array (use for loop)
                        for(int i = 0; i < seaCreaturesArray.size(); i++){
                                SeaCreatures seaCreatureObject = (SeaCreatures) seaCreaturesArray.get(i);
                                //use intersects method to see if the line intersects with the image of the sea creature
                                // if (fishingLine.getLine().intersects(seaCreatureObject.getImage().getX(), seaCreatureObject.getImage().getY(), seaCreatureObject.getImage().getFitWidth(), seaCreatureObject.getImage().getFitHeight())) {
                                //         //remove the image from the pane
                                //         this.getChildren().remove(seaCreatureObject.getImage());
                                //         //remove the sea creature from the array list
                                //         seaCreaturesArray.remove(seaCreatureObject);
                                //         //newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                                // }
                                //if fishing line end point intersects with seacreatureobject getBoundsinParent(), remove the image from the pane and array list
                                if (fishingLine.getLine().getBoundsInParent().intersects(seaCreatureObject.getImage().getBoundsInParent())) {
                                        //remove the image from the pane
                                        this.getChildren().remove(seaCreatureObject.getImage());
                                        //remove the sea creature from the array list
                                        seaCreaturesArray.remove(seaCreatureObject);
                                        //newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                                }

                        }

                });

                //down button event listener that makes the line go down
                downButton.setOnAction(e -> {
                        fishingLine.transitionLineDownward();
                        //if the line touches the image of the sea creature, then the sea creature is caught and removed from the pane
                        //and array list for all the sea creatures in the array (use for loop)
                        for(int i = 0; i < seaCreaturesArray.size(); i++){
                                SeaCreatures seaCreatureObject = (SeaCreatures) seaCreaturesArray.get(i);
                                //use getBoundsinParents method to see if the line intersects with the image of the sea creature
                                if (fishingLine.getLine().getBoundsInParent().intersects(seaCreatureObject.getImage().getBoundsInParent())) {
                                        //remove the image from the pane
                                        this.getChildren().remove(seaCreatureObject.getImage());
                                        //remove the sea creature from the array list
                                        seaCreaturesArray.remove(seaCreatureObject);
                                        //newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                                }
                        
                        }
                });

                // if (fishingLine.getLine().intersects(seaCreatureObject.getImage().getX(), seaCreatureObject.getImage().getY(), seaCreatureObject.getImage().getFitWidth(), seaCreatureObject.getImage().getFitHeight())) {
                //         //remove the image from the pane
                //         this.getChildren().remove(seaCreatureObject.getImage());
                //         //remove the sea creature from the array list
                //         seaCreaturesArray.remove(seaCreatureObject);
                //         //newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // }

                // if (fishingLine.getLine().getEndX() == seaCreatureObject.getImage().getX() && fishingLine.getLine().getEndY() == seaCreatureObject.getImage().getY()) {
                //         this.getChildren().remove(seaCreatureObject.getImage());
                //         //seaCreaturesArray.remove(seaCreatureObject);
                // }

                // //use intersect method to see if the line intersects with the image of the sea creature
                // if (fishingLine.getLine().intersects(seaCreatureObject.getImage())) {
                //         this.getChildren().remove(seaCreatureObject.getImage());
                //         seaCreaturesArray.remove(seaCreatureObject);
                // }

                // fishingLine.boundsInParentProperty().addListener(new ChangeListener<Bounds>()) {
                // @Override
                // public void changed(ObservableValue<? extends Bounds> observable, Bounds oldValue, Bounds newValue) {
                //         for (int i = 0; i < seaCreaturesArray.size(); i++) {
                //                 SeaCreatures seaCreatureObject = (SeaCreatures) seaCreaturesArray.get(i);
                //         if (fishingLine.getLine().intersects(seaCreatureObject.getImage())) {
                //                 this.getChildren().remove(seaCreatureObject.getImage());
                //                 seaCreaturesArray.remove(seaCreatureObject);
                //         }
                // }
                // }
                // }

                

                //touchlistener for each sea creature that if the line touches the image of the sea creature, then the sea creature is caught and removed from the pane
                //and array list for all the sea creatures in the array (use for loop) using a listener that checks if the line touches the image of the sea creature

               
                //cget x and y coordinates of each pixel of the sea creature image
                //if the x and y coordinates of the line match the x and y coordinates of the image, then the sea creature is caught and removed from the pane and array list
                


                // set line right below the fisherman
                // parameters represent x1, y1, x2, y2 which are the starting and ending points
                // of the line
                // -467/14
                line = new Line(339, 183, 339, 650);
                line.setStrokeWidth(2);

                line.setStartX(339);
                line.setStartY(183);
                line.setEndX(317);
                line.setEndY(827);


                
                //use fullLine method to make line longer
                fullLine(line);

                //use translate transition to move line downward
                PathTransition lineTransition = new PathTransition();
                lineTransition.setNode(line);
                lineTransition.setDuration(javafx.util.Duration.seconds(10));
                lineTransition.setPath(line);
                lineTransition.play();


                //this.getChildren().add(line);


                // add buttons
                // add help button to the top right of the pane
                Button helpButton = new Button("Help");
                helpButton.setLayoutX(780);
                helpButton.setLayoutY(10);
                helpButton.setPrefSize(100, 20);
                // set color to purple and text to white
                helpButton.setStyle("-fx-background-color: PURPLE; -fx-text-fill: #ffffff; -fx-font-size: 20px;");
                this.getChildren().add(helpButton);

                // add save button the top left of the pane
                Button saveButton = new Button("Save");
                saveButton.setLayoutX(10);
                saveButton.setLayoutY(750);
                saveButton.setPrefSize(100, 20);
                saveButton.setStyle("-fx-background-color: PURPLE; -fx-text-fill: #ffffff; -fx-font-size: 20px;");
                this.getChildren().add(saveButton);

                //do a setonFinished for each transition to make it repeat with each object in the arraylist


                // // when the fish has completed the animation, remove it from the pane
                // smallFishTransition.setOnFinished(e -> {
                //         this.getChildren().remove(smallFish);
                //         smallFish = new ImageView(
                //                         new File(FishingPane.class.getResource("smallfish.png").getPath()).toURI()
                //                                         .toString());
                //         // add the new fish to the pane
                //         this.getChildren().add(smallFish);
                //         smallFishTransition.setNode(smallFish);
                //         // set duration between 10 and 15 seconds randomly
                //         smallFishTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(5) + 10));
                //         smallFishTransition.setByX(-1000);
                //         // set the new fish to the far right of the pane in the middle
                //         smallFish.setX(900);
                //         // set Y to a random number between 400 and 500
                //         smallFish.setY(random.nextInt(100) + 400);
                //         // animate the new fish
                //         smallFishTransition.play();

                // });

                // // when smallfish2 has completed the animation, remove it from the pane
                // smallFishTransition2.setOnFinished(e -> {
                //         this.getChildren().remove(smallFish2);
                //         smallFish2 = new ImageView(
                //                         new File(FishingPane.class.getResource("smallfish_2.png").getPath()).toURI()
                //                                         .toString());
                //         // add the new fish to the pane
                //         this.getChildren().add(smallFish2);
                //         smallFishTransition2.setNode(smallFish2);
                //         smallFishTransition2.setDuration(javafx.util.Duration.seconds(random.nextInt(5) + 10));
                //         smallFishTransition2.setByX(-1000);
                //         // set the new fish to the far right of the pane in the middle
                //         smallFish2.setX(900);
                //         // set Y to a random number between 400 and 500
                //         smallFish2.setY(random.nextInt(100) + 400);
                //         // animate the new fish
                //         smallFishTransition2.play();
                // });

                // // add the same thing for smallfish3
                // smallFishTransition3.setOnFinished(e -> {
                //         this.getChildren().remove(smallFish3);
                //         smallFish3 = new ImageView(
                //                         new File(FishingPane.class.getResource("smallfish_3.png").getPath()).toURI()
                //                                         .toString());
                //         // add the new fish to the pane
                //         this.getChildren().add(smallFish3);
                //         smallFishTransition3.setNode(smallFish3);
                //         smallFishTransition3.setDuration(javafx.util.Duration.seconds(random.nextInt(5) + 10));
                //         smallFishTransition3.setByX(-1000);
                //         // set the new fish to the far right of the pane in the middle
                //         smallFish3.setX(900);
                //         // set Y to a random number between 400 and 500
                //         smallFish3.setY(random.nextInt(100) + 400);
                //         // animate the new fish
                //         smallFishTransition3.play();
                // });

                // // add the same thing for largefish
                // largeFishTransition.setOnFinished(e -> {
                //         this.getChildren().remove(largeFish);
                //         largeFish = new ImageView(
                //                         new File(FishingPane.class.getResource("largefish.png").getPath()).toURI()
                //                                         .toString());
                //         // add the new fish to the pane
                //         this.getChildren().add(largeFish);
                //         largeFishTransition.setNode(largeFish);
                //         largeFishTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(5) + 10));
                //         largeFishTransition.setByX(-1000);
                //         // set the new fish to the far right of the pane in the middle
                //         largeFish.setX(900);
                //         // set Y to a random number between 400 and 500
                //         largeFish.setY(random.nextInt(100) + 600);
                //         // animate the new fish
                //         largeFishTransition.play();
                // });

                // // add the same thing for largefish2
                // // largeFishTransition2.setOnFinished(e -> {
                // //         this.getChildren().remove(largeFish2);
                // //         largeFish2 = new ImageView(
                // //                         new File(FishingPane.class.getResource("largefish_2.png").getPath()).toURI()
                // //                                         .toString());
                // //         // add the new fish to the pane
                // //         this.getChildren().add(largeFish2);
                // //         largeFishTransition2.setNode(largeFish2);
                // //         largeFishTransition2.setDuration(javafx.util.Duration.seconds(random.nextInt(5) + 10));
                // //         largeFishTransition2.setByX(-1000);
                // //         // set the new fish to the far right of the pane in the middle
                // //         largeFish2.setX(900);
                // //         // set Y to a random number between 400 and 500
                // //         largeFish2.setY(random.nextInt(100) + 600);
                // //         // animate the new fish
                // //         largeFishTransition2.play();
                // // });

                // // add the same thing for woodenstick
                // woodenStickTransition.setOnFinished(e -> {
                //         this.getChildren().remove(woodenStick);
                //         woodenStick = new ImageView(
                //                         new File(FishingPane.class.getResource("woodenstick.png").getPath()).toURI()
                //                                         .toString());
                //         // add the new fish to the pane
                //         this.getChildren().add(woodenStick);
                //         woodenStickTransition.setNode(woodenStick);
                //         woodenStickTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(5) + 10));
                //         woodenStickTransition.setByX(-1000);
                //         // set the new fish to the far right of the pane in the middle
                //         woodenStick.setX(900);
                //         // set Y to a random number between 400 and 500
                //         woodenStick.setY(random.nextInt(100) + 600);
                //         // rotate wooden stick
                //         RotateTransition rotateagain = new RotateTransition();
                //         rotateagain.setNode(woodenStick);
                //         rotateagain.setDuration(javafx.util.Duration.seconds(15));
                //         rotateagain.setByAngle(360);
                //         rotateagain.setCycleCount(Animation.INDEFINITE);
                //         // animate and rotate the woodenstick
                //         woodenStickTransition.play();
                //         rotateagain.play();
                // });

                // //add the same thing for octopus
                // octopusTransition.setOnFinished(e -> {
                //         this.getChildren().remove(octopus);
                //         octopus = new ImageView(
                //                         new File(FishingPane.class.getResource("octopus.png").getPath()).toURI()
                //                                         .toString());
                //         // add the new fish to the pane
                //         this.getChildren().add(octopus);
                //         octopusTransition.setNode(octopus);
                //         //set duration between 15 and 30 seconds
                //         octopusTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(30) + 30));
                //         octopusTransition.setByX(-1000);
                //         // set the new fish to the far right of the pane in the middle
                //         octopus.setX(900);
                //         // set Y to a random number between 700 and 800
                //         octopus.setY(random.nextInt(100) + 700);
                //         // animate the new fish
                //         octopusTransition.play();
                // });

                // have line extend down to the bottom of the pane and then back up with every
                // spacebar press
                // TranslateTransition lineTransition = new TranslateTransition();
                // lineTransition.setOnFinished(e -> {
                // lineTransition.setNode(line);
                // lineTransition.setDuration(javafx.util.Duration.seconds(8));
                // lineTransition.setByY(183);
                // lineTransition.setByX(339);
                // lineTransition.play();
                // lineTransition.setOnFinished(ev -> {
                // lineTransition.setNode(line);
                // lineTransition.setDuration(javafx.util.Duration.seconds(8));
                // lineTransition.setByY(829);
                // lineTransition.setByX(317);
                // lineTransition.play();
                // });

                // event listener for space bar
                // this.setOnKeyPressed(e -> {
                //         if (e.getCode() == KeyCode.SPACE) {
                //                 // if the line is not already extended, extend it
                //                 line = new Line(339, 183, 339, 650 + 100);
                //                 line.setEndY(650 + 100);
                //                 line.setEndX(339);

                //         }
                // });


                //add key event handler for down arrow
                EventHandler<KeyEvent> keyEventHandler = new EventHandler<KeyEvent>() {
                        @Override
                        public void handle(KeyEvent UP) {
                                if (UP.getCode() == KeyCode.UP) {
                                        // if the line is not already extended, extend it
                                        fishingLine.transitionLineUpward();
                                        System.out.println(UP.getCode());
                                }
                        }
                };


        }
        

        public Group fullLine(Line line) {
                Line startLine = new Line(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY());
                Line endLine = new Line(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY());
                return new Group(startLine, endLine);
        }

}