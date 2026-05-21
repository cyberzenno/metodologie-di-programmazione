
public class CollaudaContenitori_02 {
	public static void main(String[] args) {
		
		Box<Frutta> boxDiFrutta = new Box<Frutta>();
		Box<Mela> boxDiMela = new Box<Mela>();
		Box<Pera> boxDiPera = new Box<Pera>();
		
		Box<Motorino> boxDiMotorino = new Box<Motorino>();
		
		BoxContainer boxContainer = new BoxContainer();
		
		boxContainer.setContenuto(boxDiFrutta);
		boxContainer.setContenuto(boxDiMela);
		boxContainer.setContenuto(boxDiMotorino);
		
		

	}

}
