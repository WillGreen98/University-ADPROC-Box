package boxes;

import java.util.Scanner;

public class BitMask {
    private int grade;
    private int type;
    private boolean bottom;
    private boolean corners;

    private static int[] typeConversion = {
            16,
            8,
            4
    };

    private int[] bitmask = {
            0b10000,
            0b01000,
            0b00100,
            0b00110,
            0b00111
    };

    /*
        PRINT TYPE  BOTTOM  CORNERS
        1   2   3
        0   0   0   0       0
        16  8   4   2       1
     */

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean isBottom() {
        return bottom;
    }

    public void setBottom(boolean bottom) {
        this.bottom = bottom;
    }

    public boolean isCorners() {
        return corners;
    }

    public void setCorners(boolean corners) {
        this.corners = corners;
    }

    public static int[] getTypeConversion() {
        return typeConversion;
    }

    public static void setTypeConversion(int[] typeConversion) {
        BitMask.typeConversion = typeConversion;
    }

    public int[] getBitmask() {
        return bitmask;
    }

    public void setBitmask(int[] bitmask) {
        this.bitmask = bitmask;
    }

    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Value For Grade: ");
        this.grade = scanner.nextInt();

        System.out.println("Enter Value For Type: ");
        this.type = scanner.nextInt();

        System.out.println("Enter Value For Bottom: ");
        this.bottom = scanner.nextBoolean();

        System.out.println("Enter Value For Corners: ");
        this.corners = scanner.nextBoolean();

        int boxParameters = 0;
        boxParameters |= typeConversion[type];
        boxParameters = (bottom) ? 2 : 0;
        boxParameters = (bottom) ? 1 : 0;

        int boxType = -1;

        for(int mask: bitmask) {
            if((boxParameters & bitmask[mask]) == boxParameters) {
                boxType = mask;
                break;
            }
        }

        if(boxType == -1) {
            System.out.println("Box type not possible");
        }

        GradeRange[] typeRange = {
                new GradeRange(1,3),
                new GradeRange(2,4),
                new GradeRange(2,5),
                new GradeRange(2,5),
                new GradeRange(3,5)
        };

        if(typeRange[boxType].testGrade(grade)) {
            System.out.println("You have chosen box type " + (boxType + 1));
        } else {
            System.out.println("not possible");
        }
    }
}
