package javaswingdev;

import java.awt.Color;
import javax.swing.Icon;

public class FontAwesomeIcon {

    public FontAwesome getIcon() {
        return icon;
    }

    public void setIcon(FontAwesome icon) {
        this.icon = icon;
    }

    public GradientType getGradientType() {
        return gradientType;
    }

    public void setGradientType(GradientType gradientType) {
        this.gradientType = gradientType;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public FontAwesomeIcon(FontAwesome icon, GradientType gradientType, Color color1, Color color2, int size) {
        this();
        this.icon = icon;
        this.gradientType = gradientType;
        this.color1 = color1;
        this.color2 = color2;
        this.size = size;
    }

    public FontAwesomeIcon() {
        IconFontSwing.register(FontAwesome.getIconFont());
    }

    private FontAwesome icon = FontAwesome.COFFEE;
    private GradientType gradientType = GradientType.HORIZONTAL;
    private Color color1 = new Color(127, 0, 255);
    private Color color2 = new Color(225, 0, 255);
    private int size = 15;

    public Icon toIcon() {
        return IconFontSwing.buildIcon(icon, size, color1, color2, gradientType);
    }
}
