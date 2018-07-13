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
		Waypoint[] zxpoints = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(16.5, 0, 0),
			    new Waypoint(21.5, 3.5, Pathfinder.d2r(20)),
			};
		//PathWriter.writePath("rightToRightScale", zxpoints, true/*isReversed*/);
		Waypoint[] zxpoints0 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(5.0, -3.5, Pathfinder.d2r(-20)),
			};
		//PathWriter.writePath("rightScaleToSwitchCube", zxpoints0, false/*isReversed*/);
		Waypoint[] zxpoints05 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(6.0, 2.0, Pathfinder.d2r(40)),
			};
		//PathWriter.writePath("switchCubeToRightScale", zxpoints05, true/*isReversed*/);
		Waypoint[] zxpoints01 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(4.5, -7.75, Pathfinder.d2r(-85)),
			    //new Waypoint(4.0, -7.75, Pathfinder.d2r(-90)),
			};
		//PathWriter.writePath("rightScaleToSecondSwitchCube", zxpoints01, false/*isReversed*/);
		Waypoint[] zxpoints02 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(4.5, 6.0, Pathfinder.d2r(105)),
			};
		//PathWriter.writePath("secondSwitchCubeToRightScale", zxpoints02, true/*isReversed*/);
		

		Waypoint[] xpoints = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(16.5, 0, 0),
			    new Waypoint(22.5, -3.5, Pathfinder.d2r(-20)),
			};
		//PathWriter.writePath("leftToLeftScale", xpoints, true/*isReversed*/);
		Waypoint[] xpoints0 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(5.0, 3.5, Pathfinder.d2r(20)),
			};
		//PathWriter.writePath("leftScaleToSwitchCube", xpoints0, false/*isReversed*/);
		Waypoint[] xpoints05 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(6.0, -2.0, Pathfinder.d2r(-40)),
			};
		//PathWriter.writePath("switchCubeToLeftScale", xpoints05, true/*isReversed*/);
		Waypoint[] xpoints01 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(4.5, 7.75, Pathfinder.d2r(85)),
			    //new Waypoint(4.0, -7.75, Pathfinder.d2r(-90)),
			};
		//PathWriter.writePath("leftScaleToSecondSwitchCube", xpoints01, false/*isReversed*/);
		Waypoint[] xpoints02 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(4.5, -6.0, Pathfinder.d2r(-105)),
			};
		//PathWriter.writePath("secondSwitchCubeToLeftScale", xpoints02, true/*isReversed*/);
		
		Waypoint[] xpoints021 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(4.0, 0.0, 0),
			};
		//PathWriter.writePath("backupToDriveStation", xpoints021, true/*isReversed*/);
		
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
		//PathWriter.writePath("leftToRightScale", points3, true/*isReversed*/);
		Waypoint[] points4x = new Waypoint[] {
				new Waypoint(0, 0, 0),
			    new Waypoint(80/12.0, 0, 0),
			    new Waypoint(120.0/12.0, -20.0/12.0, Pathfinder.d2r(-90)),
			    new Waypoint(120.0/12.0, -52.5/12.0, Pathfinder.d2r(-90)),
			};
		//PathWriter.writePath("leftToLeftSwitch", points4x, true/*isReversed*/);
		
		Waypoint[] points4 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(0.25, 0, 0),
			    new Waypoint(98.0/12.0, 50.0/12.0, 0),
			    new Waypoint(122.0/12.0, 50.0/12.0, 0),
			};
		//PathWriter.writePath("centerToLeftSwitch", points4, false/*isReversed*/);
		Waypoint[] points5 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(0.25, 0, 0),
			    new Waypoint(100.0/12.0, -42.5/12.0, 0),
			};
		PathWriter.writePath("centerToRightSwitch", points5, false/*isReversed*/);
		Waypoint[] points51 = new Waypoint[] {
				new Waypoint(0, 0, 0),
			    new Waypoint(75.0/12.0, -50.0/12.0, 0),
			    new Waypoint(80.0/12.0, -50.0/12.0, 0),
			};
		//PathWriter.writePath("rightSwitchToCenter", points51, true/*isReversed*/);
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
				new Waypoint(45.0/12.0, 45.0/12.0, Pathfinder.d2r(-90)),
				
				new Waypoint(0.0/12.0, 120.0/12.0, Pathfinder.d2r(-170)),
				new Waypoint(-200.0/12.0, 140.0/12.0, Pathfinder.d2r(-170)),
				new Waypoint(-255.0/12.0, 130.0/12.0, Pathfinder.d2r(80)),

				/*new Waypoint(0.0/12.0, 110.0/12.0, Pathfinder.d2r(-150)),
				new Waypoint(-60.0/12.0, 155.0/12.0, Pathfinder.d2r(-150)),
				new Waypoint(-200.0/12.0, 140.0/12.0, Pathfinder.d2r(-170)),
				new Waypoint(-255.0/12.0, 130.0/12.0, Pathfinder.d2r(80)),*/
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
		Waypoint[] xypoints = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(14.0, 0, 0),
			    new Waypoint(19.5, -4.0, Pathfinder.d2r(-20)),
			};
		//PathWriter.writePath("leftToAlmostScale", xypoints, true/*isReversed*/);
		Waypoint[] xypoints0 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(2.0, 2.0, Pathfinder.d2r(20)),
			};
		//PathWriter.writePath("leftAlmostScaleToSwitchCube", xypoints0, false/*isReversed*/);
		Waypoint[] xypoints1 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(2.0, 0, 0),
			};
		//PathWriter.writePath("backupFoot", xypoints1, true/*isReversed*/);
		Waypoint[] xypoints2 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(2.0, 0, 0),
			};
		//PathWriter.writePath("forwardFoot", xypoints2, false/*isReversed*/);
		Waypoint[] xypoints3 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(1.0, 0, 0),
			};
		//PathWriter.writePath("forwardHalfFoot", xypoints3, false/*isReversed*/);
		Waypoint[] xypoints4 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(2.0, 4.0, Pathfinder.d2r(70)),
			};
		//PathWriter.writePath("thirdSwitchCube", xypoints4, false/*isReversed*/);
		Waypoint[] xypoints5 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(16.0, 0, 0),
			    new Waypoint(19.75, -4.0, Pathfinder.d2r(-80)),
			    new Waypoint(20.5, -15.0, Pathfinder.d2r(-30)),
			};
		//PathWriter.writePath("leftToPlatform", xypoints5, true/*isReversed*/);
		Waypoint[] zxypoints5 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(16.0, 0, 0),
			    new Waypoint(19.75, 4.0, Pathfinder.d2r(80)),
			    new Waypoint(20.5, 15.0, Pathfinder.d2r(70)),
			};
		//PathWriter.writePath("rightToPlatform", zxypoints5, true/*isReversed*/);
		
		Waypoint[] zxypoints = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(14.0, 0, 0),
			    new Waypoint(19.5, 4.0, Pathfinder.d2r(20)),
			};
		//PathWriter.writePath("rightToAlmostScale", zxypoints, true/*isReversed*/);
		Waypoint[] zxypoints0 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				//new Waypoint(1.0, 0, 0),
			    new Waypoint(2.0, -2.0, Pathfinder.d2r(-20)),
			};
		//PathWriter.writePath("rightAlmostScaleToSwitchCube", zxypoints0, false/*isReversed*/);
		Waypoint[] zxypoints4 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(2.0, -4.0, Pathfinder.d2r(-70)),
			};
		//PathWriter.writePath("thirdSwitchCubeRight", zxypoints4, false/*isReversed*/);
	}
}
