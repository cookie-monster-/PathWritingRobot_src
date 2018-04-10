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
				new Waypoint(17.0, 0, 0),
			    new Waypoint(23.25, 2.0, Pathfinder.d2r(40)),
			};
		PathWriter.writePath("rightToRightScale", points, true/*isReversed*/);
		Waypoint[] points2 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(10.0, 0, 0),
			    new Waypoint(18.0, 4.5, Pathfinder.d2r(80)),
			    new Waypoint(18.0, 8.0, Pathfinder.d2r(90)),
			    new Waypoint(18.0, 12.0, Pathfinder.d2r(90)),
			    new Waypoint(23.25, 16.0, Pathfinder.d2r(-5)),
			};
		//PathWriter.writePath("rightToLeftScale", points2, true/*isReversed*/);
		Waypoint[] points1 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(17.0, 0, 0),
			    new Waypoint(21.0, -2, Pathfinder.d2r(-40)),
			};
		//PathWriter.writePath("leftToLeftScale", points1, false/*isReversed*/);
		Waypoint[] points3 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(10.0, 0, 0),
			    new Waypoint(16.5, -4.5, Pathfinder.d2r(-70)),
			    new Waypoint(18.75, -8.0, Pathfinder.d2r(-90)),
			    new Waypoint(18.0, -13.0, Pathfinder.d2r(-90)),
			    new Waypoint(22.0, -17.0, 0),
			};
		//PathWriter.writePath("leftToRightScale", points3, false/*isReversed*/);
		Waypoint[] points4 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(0.25, 0, 0),
			    new Waypoint(86.0/12.0, 58.0/12.0, 0),
			    new Waypoint(110.0/12.0, 58.0/12.0, 0),
			};
		//PathWriter.writePath("centerToLeftSwitch", points4, false/*isReversed*/);
		//pyramid to scale
		//46.0/12.0, 67.0/12.0, 90deg
		//0, 134.0/12.0, 180deg
		//230.0/12.0, 108.0/12.0, 45deg
		Waypoint[] points5 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(0.25, 0, 0),
			    new Waypoint(110.0/12.0, -47.0/12.0, 0),
			};
		//PathWriter.writePath("centerToRightSwitch", points5, false/*isReversed*/);
		Waypoint[] points51 = new Waypoint[] {
				new Waypoint(0, 0, 0),
			    new Waypoint(70.0/12.0, -38.0/12.0, 0),
			    new Waypoint(80.0/12.0, -38.0/12.0, 0),
			};
		//PathWriter.writePath("rightSwitchToCenter", points51, true/*isReversed*/);
		Waypoint[] points52 = new Waypoint[] {
				new Waypoint(0, 0, 0),
			    new Waypoint(63.0/12.0, 47.0/12.0, 0),
			    new Waypoint(70.0/12.0, 47.0/12.0, 0),
			};
		//PathWriter.writePath("leftSwitchToCenter", points52, true/*isReversed*/);
		Waypoint[] points53 = new Waypoint[] {
				new Waypoint(0, 0, 0),
			    new Waypoint(35.0/12.0, 0, 0),
			};
		//PathWriter.writePath("centerToPyramid", points53, false/*isReversed*/);
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
				new Waypoint(200.0/12.0, -26.0/12.0, 0.0),
				new Waypoint(154.0/12.0, 41.0/12.0, Pathfinder.d2r(90)),
				new Waypoint(200.0/12.0, 108.0/12.0, Pathfinder.d2r(180)),
			};
		//PathWriter.writePath("pyramidToLeftScale", points61, true/*isReversed*/);
		Waypoint[] points6 = new Waypoint[] {
				new Waypoint(0, 0, 0),
				new Waypoint(165.0/12.0, 0, 0),
			};
		//PathWriter.writePath("anyToCrossLine", points6, false/*isReversed*/);
	}
}
