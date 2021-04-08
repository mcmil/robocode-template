package robocodetemplate

import robocode.Robot
import robocode.ScannedRobotEvent

class KotlinBot : Robot() {
    override fun run() {
        while (true) {
            ahead(100.0)
            turnGunRight(360.0)
            back(100.0)
            turnGunRight(360.0)
        }
    }

    override fun onScannedRobot(e: ScannedRobotEvent?) {
        fire(1.0)
    }
}




