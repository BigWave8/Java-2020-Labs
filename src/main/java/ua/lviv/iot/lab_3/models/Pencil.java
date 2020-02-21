package ua.lviv.iot.lab_3.models;

public class Pencil extends AbstractWritingInstruments {
	private boolean mechanical;
	private boolean hasEraser;
	private String hardnessOfState;

	public Pencil(double priceInHryvnia, String producer, String barCode, int targetAge, String color,
			BodyShape bodyShape, BodyColor bodyColor, String bodyMaterial, int lineThicknessInMillimeters,
			boolean canChangeRod, boolean mechanical, boolean hasEraser, String hardnessOfState) {
		super(priceInHryvnia, producer, barCode, targetAge, color, bodyShape, bodyColor, bodyMaterial,
				lineThicknessInMillimeters, canChangeRod);
		this.mechanical = mechanical;
		this.hasEraser = hasEraser;
		this.hardnessOfState = hardnessOfState;
	}

	public boolean isMechanical() {
		return mechanical;
	}

	public void setMechanical(boolean mechanical) {
		this.mechanical = mechanical;
	}

	public boolean isHasEraser() {
		return hasEraser;
	}

	public void setHasEraser(boolean hasEraser) {
		this.hasEraser = hasEraser;
	}

	public String getHardnessOfState() {
		return hardnessOfState;
	}

	public void setHardnessOfState(String hardnessOfState) {
		this.hardnessOfState = hardnessOfState;
	}

}
