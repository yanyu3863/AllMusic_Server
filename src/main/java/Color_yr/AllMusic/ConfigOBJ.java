package Color_yr.AllMusic;

import Color_yr.AllMusic.MusicPlay.SendHud.SaveOBJ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigOBJ {
    private String Music_Url;

    private int Music_Api;
    private boolean AutoApi;

    private int MaxList;
    private int MinVote;
    private int Delay;

    private List<String> Admin;
    private List<String> NoMusicServer;
    private List<String> NoMusicPlayer;
    private List<String> BanMusic;
    private List<String> PlayList;

    private boolean PlayListSwitch;
    private boolean PlayListRandom;
    private boolean SendLyric;
    private boolean NeedPermission;

    private Map<String, SaveOBJ> HudSave;
    private SaveOBJ DefaultHud;

    private String Version;

    private boolean UseCost;
    private int SearchCost;
    private int AddMusicCost;

    private int DefaultAddMusic;

    private String LoginUser;
    private String LoginPass;

    public ConfigOBJ() {
        Music_Url = "http://localhost:4000";
        Music_Api = 1;
        AutoApi = false;
        MaxList = 10;
        MinVote = 3;
        Delay = 0;
        Admin = new ArrayList<String>() {{
            this.add("CONSOLE");
        }};
        NoMusicServer = new ArrayList<>();
        NoMusicPlayer = new ArrayList<>();
        BanMusic = new ArrayList<>();
        PlayList = new ArrayList<>();
        PlayListSwitch = true;
        PlayListRandom = true;
        SendLyric = true;
        NeedPermission = false;
        HudSave = new HashMap<>();
        DefaultHud = new SaveOBJ();

        UseCost = false;
        SearchCost = 20;
        AddMusicCost = 10;

        DefaultAddMusic = 0;
        LoginUser = "";
        LoginPass = "";

        Version = AllMusic.Version;
    }

    public boolean isUseCost() {
        return UseCost;
    }

    public String getLoginUser() {
        return LoginUser;
    }

    public String getLoginPass() {
        return LoginPass;
    }

    public int getDefaultAddMusic() {
        return DefaultAddMusic;
    }

    public int getAddMusicCost() {
        return AddMusicCost;
    }

    public int getSearchCost() {
        return SearchCost;
    }

    public SaveOBJ getDefaultHud() {
        return DefaultHud;
    }

    public String getMusic_Url() {
        return Music_Url;
    }

    public int getMusic_Api() {
        return Music_Api;
    }

    public void setMusic_Api(int music_Api) {
        Music_Api = music_Api;
    }

    public boolean isNeedPermission() {
        return NeedPermission;
    }

    public boolean isSendLyric() {
        return SendLyric;
    }

    public SaveOBJ getInfoSave(String player) {
        return HudSave.get(player);
    }

    public void setInfoSave(SaveOBJ obj, String player) {
        HudSave.put(player, obj);
    }

    public boolean isPlayListRandom() {
        return PlayListRandom;
    }

    public List<String> getPlayList() {
        return PlayList;
    }

    public boolean isPlayListSwitch() {
        return PlayListSwitch;
    }

    public int getDelay() {
        return Delay;
    }

    public String getVersion() {
        return Version;
    }

    public int getMaxList() {
        return MaxList;
    }

    public int getMinVote() {
        return MinVote;
    }

    public List<String> getAdmin() {
        return Admin;
    }

    public List<String> getNoMusicPlayer() {
        return NoMusicPlayer;
    }

    public List<String> getNoMusicServer() {
        return NoMusicServer;
    }

    public List<String> getBanMusic() {
        return BanMusic;
    }

    public void addBanID(String ID) {
        if (!BanMusic.contains(ID))
            BanMusic.add(ID);
        AllMusic.save();
    }

    public void AddNoMusicPlayer(String ID) {
        if (!NoMusicPlayer.contains(ID))
            NoMusicPlayer.add(ID);
        AllMusic.save();
    }

    public void RemoveNoMusicPlayer(String ID) {
        NoMusicPlayer.remove(ID);
        AllMusic.save();
    }

    public boolean isAutoApi() {
        return AutoApi;
    }

    public void setAutoApi(boolean autoApi) {
        AutoApi = autoApi;
    }
}
