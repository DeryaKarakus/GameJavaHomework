package Entities.concretes;


public class Game {
    int gameId;
    String gameName;
    double gamePrice;
    double campaignPrice;
    String gameType;
    String gameDescription;
    String releaseDate;
    String developer;


    public Game(int gameId, String gameName, double gamePrice, double campaignPrice, String gameType, String gameDescription, String releaseDate, String developer) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.campaignPrice = campaignPrice;
        this.gameType = gameType;
        this.gameDescription = gameDescription;
        this.releaseDate = releaseDate;
        this.developer = developer;
    }


    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public double getCampaignPrice() {
        return campaignPrice;
    }

    public void setCampaignPrice(double campaignPrice) {
        this.campaignPrice = campaignPrice;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public void setGameDescription(String gameDescription) {
        this.gameDescription = gameDescription;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }
}
