package com.messages;

import java.io.Serializable;
import java.util.Map;

public class Message implements Serializable{

    private String[][] board;
    private Map<String,Integer> playerScore;
    private Map<String,String> connectedClients;
    private Map<Integer,Integer> createdGames;
    private Map<String,String> playerList;
    private PlayerAction playerAction;
    private GameStatus gameStatus;
    private PlayerStatus playerStatus;
    private String gameCharacter;
    private int[] gameLocation;
    private int wordOrientation;
    private String gameWord;
    private String clientName;
    private String feedBackMessage;
    private boolean votingResult;
    private int clientNum;
    private int tableId;
    private int votingNum;
    private boolean startVoting=true;
    private String clientToVoteFor;
    private static final long serialVersionUID = 1L;
    private String gameResult;
    private String chatMessage;

    public String getGameResult(){
        return gameResult;
    }
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setVotingResult(boolean votingResult){
        this.votingResult = votingResult;
    }
    public boolean getVotingResult(){
        return votingResult;
    }
    public void setPlayerScore(Map<String,Integer> playerScore){
        this.playerScore = playerScore;
    }

    public Map<String,Integer> getPlayerScore(){
        return playerScore;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    public String[][] getBoard() {
        return board;
    }
    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getClientNum() {
        return clientNum;
    }

    public void setClientNum(int clientNum) {
        this.clientNum = clientNum;
    }

    public PlayerStatus getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(PlayerStatus playerStatus) {
        this.playerStatus = playerStatus;
    }

    public PlayerAction getPlayerAction() {
        return playerAction;
    }

    public void setPlayerAction(PlayerAction playerAction) {
        this.playerAction = playerAction;
    }

    public String getGameCharacter() {
        return gameCharacter;
    }

    public void setGameCharacter(String gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    public int[] getGameLocation() {
        return gameLocation;
    }

    public void setGameLocation(int[] gameLocation) {
        this.gameLocation = gameLocation;
    }

    public void setWordOrientation(int wordOrientation){ this.wordOrientation=wordOrientation; }

    public int getWordOrientation(){ return wordOrientation; }

    public String getGameWord() {
        return gameWord;
    }

    public void setGameWord(String gameWord) {
        this.gameWord = gameWord;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientToVoteFor() {
        return clientToVoteFor;
    }

    public void setClientToVoteFor(String clientToVoteFor) {
        this.clientToVoteFor = clientToVoteFor;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public String getFeedBackMessage() {
        return feedBackMessage;
    }

    public void setFeedBackMessage(String feedBackMessage) {
        this.feedBackMessage = feedBackMessage;
    }
    /*
    public List<GameRoom> getCreatedGames() {
        return createdGames;
    }

    public void setCreatedGames(List<GameRoom> createdGames) {
        this.createdGames = createdGames;
    }*/

    /*public EachConnection[] getPlayerList() {
        return playerList;
    }

    public void setPlayerList(EachConnection[] playerList) {
        this.playerList = playerList;
    }*/

    public int getVotingNum() {
        return votingNum;
    }

    public void setVotingNum(int votingNum) {
        this.votingNum = votingNum;
    }

    public boolean getstartVoting() {
        return startVoting;
    }

    public void setStartVoting(boolean startVoting) {
        this.startVoting = startVoting;
    }

    public Map<String, String> getConnectedClients() {
        return connectedClients;
    }

    public void setConnectedClients(Map<String, String> connectedClients) {
        this.connectedClients = connectedClients;
    }

    public Map<Integer, Integer> getCreatedGames() {
        return createdGames;
    }

    public void setCreatedGames(Map<Integer, Integer> createdGames) {
        this.createdGames = createdGames;
    }

    public Map<String, String> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(Map<String, String> playerList) {
        this.playerList = playerList;
    }

    public void setChatMessage(String m){ chatMessage=m; }

    public String getChatMessage(){ return chatMessage; }
}

