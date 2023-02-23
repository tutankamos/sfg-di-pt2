package com.springframework.pets;

// import org.springframework.context.annotation.Profile;
// import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
// non usiamo piu' queste annotazioni perche' abbiamo le configurazioni java, sul file configuration
// @Profile({"dog", "default"})
// @Service
public class DogPetService implements PetService {
    public String getPetType(){
        return "Dogs are the best!";
    }
}
