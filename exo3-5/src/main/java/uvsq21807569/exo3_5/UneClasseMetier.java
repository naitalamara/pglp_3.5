package uvsq21807569.exo3_5;

import java.time.LocalDateTime;

public class UneClasseMetier {

	public void uneMethodeMetier(InterfaceAffich a) {
		 a.affichage((LocalDateTime.now() + ": Début de uneMethodeMetier"));
		 
		 a.affichage((LocalDateTime.now() + ": fin de uneMethodeMetier"));
	}
}