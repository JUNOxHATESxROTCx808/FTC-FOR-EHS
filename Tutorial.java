package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Tutorial extends OpMode {

    DcMotor motor;
    @Override
    public void init() {
        motor = hardwareMap.get(DcMotor.class,"motor");
        telemetry.addData("Hardware: ", "Initialized");




    }

    @Override
    public void loop() {

        float x = gamepad1.left_stick_x;
        if (gamepad1.left_stick_x > 0){
            motor.setPower(x);
        }
        motor.setPower(0);
    }
}
