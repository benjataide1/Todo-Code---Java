package Exercise_Games.logic;

public class VideoGames {

    private int code;
    private String title;
    private String console;
    private int amountPlayers;
    private String categorie;


    public VideoGames() {
    }

    public VideoGames(int code, String title, String console, int amountPlayers, String categorie) {
        this.code = code;
        this.title = title;
        this.console = console;
        this.amountPlayers = amountPlayers;
        this.categorie = categorie;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return this.console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getAmountPlayers() {
        return this.amountPlayers;
    }

    public void setAmountPlayers(int amountPlayers) {
        this.amountPlayers = amountPlayers;
    }

    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("VideoGames{");
        sb.append("code=").append(this.code);
        sb.append(", title='").append(this.title).append('\'');
        sb.append(", console='").append(this.console).append('\'');
        sb.append(", amountPlayers=").append(this.amountPlayers);
        sb.append(", categorie='").append(this.categorie).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
