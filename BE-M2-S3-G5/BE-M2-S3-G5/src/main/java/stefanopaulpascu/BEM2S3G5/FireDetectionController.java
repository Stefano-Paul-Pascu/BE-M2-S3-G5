package stefanopaulpascu.BEM2S3G5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

class FireDetectionController {
    private final FireDetectionSensor sensor;

    public FireDetectionController(FireDetectionSensor sensor) {
        this.sensor = sensor;
    }

    @GetMapping("/detection")
    public String detectFire(@RequestParam String sondaId,
                             @RequestParam double latitude,
                             @RequestParam double longitude,
                             @RequestParam int smokeLevel) {
        sensor.setSondaId(sondaId);
        sensor.setLatitude(latitude);
        sensor.setLongitude(longitude);
        sensor.setSmokeLevel(smokeLevel);
        sensor.checkFireAlarm();
        return "Detection received";
    }
}