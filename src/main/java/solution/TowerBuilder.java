package solution;

public class TowerBuilder {
    public static String[] towerBuilder(int nFloors) {
        StringBuilder[] temp = new StringBuilder[nFloors];
        String[] result = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            temp[i] = new StringBuilder("");
        }
        int starCounter = (nFloors * 2) - 1;
        for (int i = 0; i < nFloors; i++) {
            setSpaces(temp[nFloors - i - 1], i + 1);
            setStars(temp[nFloors - i - 1], starCounter);
            setSpaces(temp[nFloors - i - 1], i + 1);
            starCounter -= 2;
        }
        for (int i = 0; i < nFloors; i++) {
            result[i] = temp[i].toString();
            System.out.println("["+result[i]+"]");
        }
        return result;
    }
    private static StringBuilder setSpaces(StringBuilder element, int count) {
        for (int i = 0; i < count-1; i++)
            element.append(" ");
        return element;
    }
    private static StringBuilder setStars(StringBuilder element, int count) {
        for (int i = 0; i < count; i++)
            element.append("*");
        return element;
    }
}

/** кросивое
 * public static String[] towerBuilder(int nFloors) {
 *         String[] tower = new String[nFloors];
 *         for (int i = 0; i < nFloors; i++)
 *             tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
 *         return tower;
 *     }
 *
 *
 */

//  input 3
// [   *   ]
// [  ***  ]
// [ ***** ]

//   input 4
// [    *    ]
// [   ***   ]
// [  *****  ]
// [ ******* ]