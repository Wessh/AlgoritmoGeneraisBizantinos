package generaisbizantinos;
/***********************************************

Problema dos Generais Bizantinos:
        - Generais cercam uma cidade com suas tropas.
        - Generais estão separados pelo relevo, somente podem 
          se comunicar através de mensageiros.
        - Generais só vencem se todos atacarem ao mesmo tempo.

Teoremas:
        1º - Se 2/3 + 1 dos generais (processos) forem leais (não falharem),
        existe uma solução (algoritmo) que resultará numa ação comum, independente de possíveis 
        mensagens enviadas pelos traidores.
        2º - Se 1/3 ou mais dos generais (processos) forem traidores (falharem),
        não existe solução para este problema.




***********************************************/
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		General general = new General(); 
		general.calcular();
		
		Traidor traidor = new Traidor();
		traidor.calcular();

	}
}
