/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolos2.TypyGeneryczne;

/**
 *
 * @author Asia
 */
public class BoxForFigures <T extends Figure> { //typ generyczny ale taki, który rozszerzony jest o interface Figure
    private T element;

    public BoxForFigures(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public String getElementName() {
        return element.getName();
    }
}
