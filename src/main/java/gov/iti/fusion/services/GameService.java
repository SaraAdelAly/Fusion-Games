package gov.iti.fusion.services;

import java.util.List;

import gov.iti.fusion.models.Game;
import gov.iti.fusion.persistence.repositories.GameRepository;
import jakarta.servlet.http.HttpServletRequest;

public class GameService {
    
    private final GameRepository gameRepository;

    public GameService(HttpServletRequest request) {
        this.gameRepository = new GameRepository(request);
    }

    public Game save(Game game){
        return gameRepository.save(game);
    }

    public Game findGameByName(String name){
        return gameRepository.findGameByName(name);
    }
    
    public Game delete(Game game){
        return gameRepository.delete(game);
    }
    public List<Game> findAllGames(){
        return gameRepository.findAll(Game.class);
    }   
}
