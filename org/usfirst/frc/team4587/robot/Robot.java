/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4587.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.Waypoint;
import paths.PathWriter;

public class Robot extends TimedRobot {

	@Override
	public void robotInit() {
		Waypoint[] points = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(16.5, 0, 0),
			    new Waypoint(23.0, 2.5, Pathfinder.d2r(25)),
			};
		//PathWriter.writePath("rightToRightScale", points, true/*isReversed*/);
		Waypoint[] points0 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    //new Waypoint(4.75, -4.25, Pathfinder.d2r(-75)), WORLDS
			    new Waypoint(4.25, -2.0, Pathfinder.d2r(-25)),
			};
		//PathWriter.writePath("rightScaleToSwitchCube", points0, false/*isReversed*/);
		Waypoint[] points05 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    //new Waypoint(5.0, 5.0, Pathfinder.d2r(70)), WORLDS
				new Waypoint(5.5, 0.0, Pathfinder.d2r(30)),
			};
		//PathWriter.writePath("switchCubeToRightScale", points05, true/*isReversed*/);
		Waypoint[] points01 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(4.5, -7.75, Pathfinder.d2r(-85)),
			    //new Waypoint(4.0, -7.75, Pathfinder.d2r(-90)),
			};
		//PathWriter.writePath("rightScaleToSecondSwitchCube", points01, false/*isReversed*/);
		Waypoint[] points02 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(5.0, 6.25, Pathfinder.d2r(105)),
			};
		//PathWriter.writePath("secondSwitchCubeToRightScale", points02, true/*isReversed*/);
		

		Waypoint[] xpoints = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(15.5, 0, 0),
			    new Waypoint(22.18, -5.0, Pathfinder.d2r(-25)),
			};
		//PathWriter.writePath("leftToLeftScale", xpoints, true/*isReversed*/);
		Waypoint[] xpoints0 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(4.5, 6.0, Pathfinder.d2r(90)),
			};
		//PathWriter.writePath("leftScaleToSwitchCube", xpoints0, false/*isReversed*/);
		Waypoint[] xpoints05 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(5.0, -5.0, Pathfinder.d2r(-90)),
			};
		//PathWriter.writePath("switchCubeToLeftScale", xpoints05, true/*isReversed*/);
		Waypoint[] xpoints01 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(4.25, 7.65, Pathfinder.d2r(85)),
			    //new Waypoint(4.0, -7.75, Pathfinder.d2r(-90)),
			};
		//PathWriter.writePath("leftScaleToSecondSwitchCube", xpoints01, false/*isReversed*/);
		Waypoint[] xpoints02 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(4.75, -6.25, Pathfinder.d2r(-105)),
			};
		//PathWriter.writePath("secondSwitchCubeToLeftScale", xpoints02, true/*isReversed*/);
		
		Waypoint[] points2 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(10.0, 0, 0),
			    new Waypoint(18.0, 4.5, Pathfinder.d2r(80)),
			    new Waypoint(18.0, 8.0, Pathfinder.d2r(90)),
			    new Waypoint(18.0, 11.0, Pathfinder.d2r(90)),
			    new Waypoint(23.25, 15.0, Pathfinder.d2r(-5)),
			};
		//PathWriter.writePath("rightToLeftScale", points2, true/*isReversed*/);
		Waypoint[] points3 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(10.0, 0, 0),
			    new Waypoint(17.5, -3.5, Pathfinder.d2r(-75)),
			    new Waypoint(19.75, -8.5, Pathfinder.d2r(-90)),
			    new Waypoint(19.75, -15.0, Pathfinder.d2r(-90)),
			    new Waypoint(24.5, -18.5, 0),
			    new Waypoint(27.0, -18.25, Pathfinder.d2r(20)),
			};
		PathWriter.writePath("leftToRightScale", points3, true/*isReversed*/);
		Waypoint[] points4 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(0.25, 0, 0),
			    new Waypoint(98.0/12.0, 50.0/12.0, 0),
			    new Waypoint(122.0/12.0, 50.0/12.0, 0),
			};
		//PathWriter.writePath("centerToLeftSwitch", points4, false/*isReversed*/);
		//pyramid to scale
		//46.0/12.0, 67.0/12.0, 90deg
		//0, 134.0/12.0, 180deg
		//230.0/12.0, 108.0/12.0, 45deg
		Waypoint[] points5 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(0.25, 0, 0),
			    new Waypoint(122.0/12.0, -45.0/12.0, 0),
			};
		//PathWriter.writePath("centerToRightSwitch", points5, false/*isReversed*/);
		Waypoint[] points51 = new Waypoint[] {
				new Waypoint(0, 0, 0),
			    new Waypoint(80.0/12.0, -50.0/12.0, 0),
			    new Waypoint(85.0/12.0, -50.0/12.0, 0),
			};
	//	PathWriter.writePath("rightSwitchToCenter", points51, true/*isReversed*/);
		Waypoint[] points52 = new Waypoint[] {
				new Waypoint(0, 0, 0),
			    new Waypoint(63.0/12.0, 47.0/12.0, 0),
			    new Waypoint(70.0/12.0, 47.0/12.0, 0),
			};
	//	PathWriter.writePath("leftSwitchToCenter", points52, true/*isReversed*/);
		Waypoint[] points53 = new Waypoint[] {
				new Waypoint(0, 0, 0),
			    new Waypoint(60.0/12.0, 0, 0),
			};
	//	PathWriter.writePath("centerToPyramid", points53, false/*isReversed*/);
		//center to right switch
		//96.0/12.0, -40.5/12.0
		//switch to centerish
		//83.0/12.0,  45.625/12.0
		//centerish to pyramid
		//48.0/12.0,  0
		//pyramid to scale
		//46.0/12.0, 67.0/12.0, 90deg
		//0, 134.0/12.0, 180deg
		//230.0/12.0, 108.0/12.0, 45deg

		Waypoint[] points61 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				/*new Waypoint(46.0/12.0, 67.0/12.0, Pathfinder.d2r(90)),
				new Waypoint(0.0, 134.0/12.0, Pathfinder.d2r(180)),
				new Waypoint(200.0/12.0, 108.0/12.0, Pathfinder.d2r(180)),*/
				new Waypoint(60.0/12.0, 60.0/12.0, Pathfinder.d2r(-90)),
				new Waypoint(0.0/12.0, 120.0/12.0, Pathfinder.d2r(-170)),
				new Waypoint(-160.0/12.0, 120.0/12.0, Pathfinder.d2r(-170)),
				//new Waypoint(-200.0/12.0, 65.0/12.0, Pathfinder.d2r(-150)),
			};
		//PathWriter.writePath("pyramidToRightScale", points61, true/*isReversed*/);
		Waypoint[] points62 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				/*new Waypoint(46.0/12.0, 67.0/12.0, Pathfinder.d2r(90)),
				new Waypoint(0.0, 134.0/12.0, Pathfinder.d2r(180)),
				new Waypoint(200.0/12.0, 108.0/12.0, Pathfinder.d2r(180)),*/
				new Waypoint(40.0/12.0, -40.0/12.0, Pathfinder.d2r(90)),
				new Waypoint(0.0/12.0, -85.0/12.0, Pathfinder.d2r(180)),
				new Waypoint(-160.0/12.0, -85.0/12.0, Pathfinder.d2r(180)),
				new Waypoint(-200.0/12.0, -65.0/12.0, Pathfinder.d2r(150)),
			};
		//PathWriter.writePath("pyramidToLeftScale", points62, true/*isReversed*/);
		Waypoint[] points6 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(165.0/12.0, 0, 0),
				//new Waypoint(3.0, 0, 0),
			};
		//PathWriter.writePath("anyToCrossLine", points6, false/*isReversed*/);
		Waypoint[] xpoints6 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(165.0/12.0, 0, 0),
				//new Waypoint(-3.0, 0, 0),
			};
		//PathWriter.writePath("anyToCrossLineBackwards", xpoints6, true/*isReversed*/);
	}
}
