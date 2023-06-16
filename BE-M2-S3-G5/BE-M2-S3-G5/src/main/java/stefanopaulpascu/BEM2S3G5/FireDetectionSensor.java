package stefanopaulpascu.BEM2S3G5;

class FireDetectionSensor {
    private String sondaId;
    private double latitude;
    private double longitude;
    private int smokeLevel;

    public void setSondaId(String sondaId) {
        this.sondaId = sondaId;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setSmokeLevel(int smokeLevel) {
        this.smokeLevel = smokeLevel;
    }

    public void checkFireAlarm() {
        if (smokeLevel > 5) {
            notifyControlCenter();
        }
    }

    private void notifyControlCenter() {
        String url = "http://host/alarm?idsonda=" + sondaId + "&lat=" + latitude + "&lon=" + longitude + "&smokelevel=" + smokeLevel;
        System.out.println("Notifica: " + url);
    }
}