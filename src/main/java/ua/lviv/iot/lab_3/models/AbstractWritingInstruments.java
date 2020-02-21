package ua.lviv.iot.lab_3.models;

public abstract class AbstractWritingInstruments extends AbstractWritingAccessories {
	private int lineThicknessInMillimeters;
	private boolean canChangeRod;
	public AbstractWritingInstruments(double priceInHryvnia, String producer, String barCode, int targetAge,
			String color, BodyShape bodyShape, BodyColor bodyColor, String bodyMaterial, int lineThicknessInMillimeters,
			boolean canChangeRod) {
		super(priceInHryvnia, producer, barCode, targetAge, color, bodyShape, bodyColor, bodyMaterial);
		this.lineThicknessInMillimeters = lineThicknessInMillimeters;
		this.canChangeRod = canChangeRod;
	}
	public int getLineThicknessInMillimeters() {
		return lineThicknessInMillimeters;
	}
	public void setLineThicknessInMillimeters(int lineThicknessInMillimeters) {
		this.lineThicknessInMillimeters = lineThicknessInMillimeters;
	}
	public boolean isCanChangeRod() {
		return canChangeRod;
	}
	public void setCanChangeRod(boolean canChangeRod) {
		this.canChangeRod = canChangeRod;
	}

}
