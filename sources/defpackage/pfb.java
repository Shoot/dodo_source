package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: pfb  reason: default package */
/* loaded from: classes3.dex */
public class pfb implements xc0 {
    private static int[] h;
    private static int[] i;
    private static int[] j;
    private static int[] k;
    private int a;
    private int b;
    private long[] c;
    private long[] d;
    private long[] e;
    private d f;
    private boolean g;

    /* renamed from: pfb$a */
    /* loaded from: classes3.dex */
    private static final class a extends d {
        public a(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // defpackage.pfb.d
        void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = pfb.i;
            int[] iArr2 = pfb.k;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            long j13 = jArr[12];
            long j14 = jArr[13];
            long j15 = jArr[14];
            long j16 = jArr[15];
            int i2 = 19;
            while (i2 >= i) {
                int i3 = iArr[i2];
                int i4 = iArr2[i2];
                int i5 = i3 + 1;
                long j17 = j - jArr3[i5];
                int i6 = i3 + 2;
                long j18 = j2 - jArr3[i6];
                int i7 = i3 + 3;
                long j19 = j3 - jArr3[i7];
                int i8 = i3 + 4;
                long j20 = j4 - jArr3[i8];
                int i9 = i3 + 5;
                long j21 = j5 - jArr3[i9];
                int i10 = i3 + 6;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j22 = j6 - jArr3[i10];
                int i11 = i3 + 7;
                long j23 = j7 - jArr3[i11];
                int i12 = i3 + 8;
                long j24 = j8 - jArr3[i12];
                int i13 = i3 + 9;
                long j25 = j9 - jArr3[i13];
                int i14 = i3 + 10;
                long j26 = j10 - jArr3[i14];
                int i15 = i3 + 11;
                long j27 = j11 - jArr3[i15];
                int i16 = i3 + 12;
                long j28 = j12 - jArr3[i16];
                int i17 = i3 + 13;
                long j29 = j13 - jArr3[i17];
                int i18 = i3 + 14;
                int i19 = i4 + 1;
                long j30 = j14 - (jArr3[i18] + jArr4[i19]);
                int i20 = i3 + 15;
                long j31 = j15 - (jArr3[i20] + jArr4[i4 + 2]);
                long[] jArr5 = jArr3;
                long j32 = i2;
                long n = pfb.n(j16 - ((jArr3[i3 + 16] + j32) + 1), 9, j17);
                long j33 = j17 - n;
                long n2 = pfb.n(j28, 48, j19);
                long j34 = j19 - n2;
                long n3 = pfb.n(j30, 35, j23);
                long j35 = j23 - n3;
                long[] jArr6 = jArr4;
                long n4 = pfb.n(j26, 52, j21);
                long j36 = j21 - n4;
                long n5 = pfb.n(j18, 23, j31);
                long j37 = j31 - n5;
                long n6 = pfb.n(j22, 31, j25);
                long j38 = j25 - n6;
                long n7 = pfb.n(j20, 37, j27);
                long j39 = j27 - n7;
                long n8 = pfb.n(j24, 20, j29);
                long j40 = j29 - n8;
                long n9 = pfb.n(n8, 31, j33);
                long j41 = j33 - n9;
                long n10 = pfb.n(n6, 44, j34);
                long j42 = j34 - n10;
                long n11 = pfb.n(n7, 47, j36);
                long j43 = j36 - n11;
                long n12 = pfb.n(n5, 46, j35);
                long j44 = j35 - n12;
                long n13 = pfb.n(n, 19, j40);
                long j45 = j40 - n13;
                long n14 = pfb.n(n3, 42, j37);
                long j46 = j37 - n14;
                long n15 = pfb.n(n2, 44, j38);
                long j47 = j38 - n15;
                long n16 = pfb.n(n4, 25, j39);
                long j48 = j39 - n16;
                long n17 = pfb.n(n16, 16, j41);
                long j49 = j41 - n17;
                long n18 = pfb.n(n14, 34, j42);
                long j50 = j42 - n18;
                long n19 = pfb.n(n15, 56, j44);
                long j51 = j44 - n19;
                long n20 = pfb.n(n13, 51, j43);
                long j52 = j43 - n20;
                long n21 = pfb.n(n9, 4, j48);
                long j53 = j48 - n21;
                long n22 = pfb.n(n11, 53, j45);
                long j54 = j45 - n22;
                long n23 = pfb.n(n10, 42, j46);
                long j55 = j46 - n23;
                long n24 = pfb.n(n12, 41, j47);
                long j56 = j47 - n24;
                long n25 = pfb.n(n24, 41, j49);
                long n26 = pfb.n(n22, 9, j50);
                long n27 = pfb.n(n23, 37, j52);
                long j57 = j52 - n27;
                long n28 = pfb.n(n21, 31, j51);
                long j58 = j51 - n28;
                long n29 = pfb.n(n17, 12, j56);
                long j59 = j56 - n29;
                long n30 = pfb.n(n19, 47, j53);
                long j60 = j53 - n30;
                long n31 = pfb.n(n18, 44, j54);
                long j61 = j54 - n31;
                long n32 = pfb.n(n20, 30, j55);
                long j62 = j55 - n32;
                long j63 = (j49 - n25) - jArr5[i3];
                long j64 = n25 - jArr5[i5];
                long j65 = (j50 - n26) - jArr5[i6];
                long j66 = n26 - jArr5[i7];
                long j67 = j57 - jArr5[i8];
                long j68 = n27 - jArr5[i9];
                long j69 = j58 - jArr5[i10];
                long j70 = n28 - jArr5[i11];
                long j71 = j59 - jArr5[i12];
                long j72 = n29 - jArr5[i13];
                long j73 = j60 - jArr5[i14];
                long j74 = n30 - jArr5[i15];
                long j75 = j61 - jArr5[i16];
                long j76 = n31 - (jArr5[i17] + jArr6[i4]);
                long j77 = j62 - (jArr5[i18] + jArr6[i19]);
                long n33 = pfb.n(n32 - (jArr5[i20] + j32), 5, j63);
                long j78 = j63 - n33;
                long n34 = pfb.n(j74, 20, j65);
                long j79 = j65 - n34;
                long n35 = pfb.n(j76, 48, j69);
                long j80 = j69 - n35;
                long n36 = pfb.n(j72, 41, j67);
                long j81 = j67 - n36;
                long n37 = pfb.n(j64, 47, j77);
                long j82 = j77 - n37;
                long n38 = pfb.n(j68, 28, j71);
                long j83 = j71 - n38;
                long n39 = pfb.n(j66, 16, j73);
                long j84 = j73 - n39;
                long n40 = pfb.n(j70, 25, j75);
                long j85 = j75 - n40;
                long n41 = pfb.n(n40, 33, j78);
                long j86 = j78 - n41;
                long n42 = pfb.n(n38, 4, j79);
                long j87 = j79 - n42;
                long n43 = pfb.n(n39, 51, j81);
                long j88 = j81 - n43;
                long n44 = pfb.n(n37, 13, j80);
                long j89 = j80 - n44;
                long n45 = pfb.n(n33, 34, j85);
                long j90 = j85 - n45;
                long n46 = pfb.n(n35, 41, j82);
                long j91 = j82 - n46;
                long n47 = pfb.n(n34, 59, j83);
                long j92 = j83 - n47;
                long n48 = pfb.n(n36, 17, j84);
                long j93 = j84 - n48;
                long n49 = pfb.n(n48, 38, j86);
                long j94 = j86 - n49;
                long n50 = pfb.n(n46, 19, j87);
                long j95 = j87 - n50;
                long n51 = pfb.n(n47, 10, j89);
                long j96 = j89 - n51;
                long n52 = pfb.n(n45, 55, j88);
                long j97 = j88 - n52;
                long n53 = pfb.n(n41, 49, j93);
                long j98 = j93 - n53;
                long n54 = pfb.n(n43, 18, j90);
                long j99 = j90 - n54;
                long n55 = pfb.n(n42, 23, j91);
                long j100 = j91 - n55;
                long n56 = pfb.n(n44, 52, j92);
                long j101 = j92 - n56;
                long n57 = pfb.n(n56, 24, j94);
                long j102 = j94 - n57;
                long n58 = pfb.n(n54, 13, j95);
                j3 = j95 - n58;
                long n59 = pfb.n(n55, 8, j97);
                long j103 = j97 - n59;
                long n60 = pfb.n(n53, 47, j96);
                long j104 = j96 - n60;
                long n61 = pfb.n(n49, 8, j101);
                long j105 = j101 - n61;
                long n62 = pfb.n(n51, 17, j98);
                long j106 = j98 - n62;
                long n63 = pfb.n(n50, 22, j99);
                j13 = j99 - n63;
                j16 = pfb.n(n52, 37, j100);
                j15 = j100 - j16;
                j12 = n62;
                j10 = n61;
                iArr = iArr3;
                iArr2 = iArr4;
                jArr4 = jArr6;
                jArr3 = jArr5;
                j14 = n63;
                j9 = j105;
                i = 1;
                i2 -= 2;
                j2 = n57;
                j4 = n58;
                j11 = j106;
                j8 = n60;
                j5 = j103;
                j6 = n59;
                j7 = j104;
                j = j102;
            }
            long[] jArr7 = jArr3;
            long[] jArr8 = jArr4;
            long j107 = j - jArr7[0];
            long j108 = j2 - jArr7[1];
            long j109 = j3 - jArr7[2];
            long j110 = j4 - jArr7[3];
            long j111 = j5 - jArr7[4];
            long j112 = j6 - jArr7[5];
            long j113 = j7 - jArr7[6];
            long j114 = j8 - jArr7[7];
            long j115 = j9 - jArr7[8];
            long j116 = j10 - jArr7[9];
            long j117 = j11 - jArr7[10];
            long j118 = j13 - jArr7[12];
            long j119 = j14 - (jArr7[13] + jArr8[0]);
            long j120 = j15 - (jArr7[14] + jArr8[1]);
            jArr2[0] = j107;
            jArr2[1] = j108;
            jArr2[2] = j109;
            jArr2[3] = j110;
            jArr2[4] = j111;
            jArr2[5] = j112;
            jArr2[6] = j113;
            jArr2[7] = j114;
            jArr2[8] = j115;
            jArr2[9] = j116;
            jArr2[10] = j117;
            jArr2[11] = j12 - jArr7[11];
            jArr2[12] = j118;
            jArr2[13] = j119;
            jArr2[14] = j120;
            jArr2[15] = j16 - jArr7[15];
        }

        @Override // defpackage.pfb.d
        void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = pfb.i;
            int[] iArr2 = pfb.k;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
            long j = jArr[0];
            int i = 1;
            long j2 = jArr[1];
            long j3 = jArr[2];
            long j4 = jArr[3];
            long j5 = jArr[4];
            long j6 = jArr[5];
            long j7 = jArr[6];
            long j8 = jArr[7];
            long j9 = jArr[8];
            long j10 = jArr[9];
            long j11 = jArr[10];
            long j12 = jArr[11];
            long j13 = jArr[12];
            long j14 = jArr[13];
            long j15 = jArr[14];
            long j16 = jArr[15];
            long j17 = j + jArr3[0];
            long j18 = j2 + jArr3[1];
            long j19 = j3 + jArr3[2];
            long j20 = j4 + jArr3[3];
            long j21 = j5 + jArr3[4];
            long j22 = j6 + jArr3[5];
            long j23 = j7 + jArr3[6];
            long j24 = j8 + jArr3[7];
            long j25 = j9 + jArr3[8];
            long j26 = j10 + jArr3[9];
            long j27 = j11 + jArr3[10];
            long j28 = j12 + jArr3[11];
            long j29 = j13 + jArr3[12];
            long j30 = j14 + jArr3[13] + jArr4[0];
            long j31 = j15 + jArr3[14] + jArr4[1];
            long j32 = j20;
            long j33 = j22;
            long j34 = j24;
            long j35 = j26;
            long j36 = j28;
            long j37 = j30;
            long j38 = j16 + jArr3[15];
            while (i < 20) {
                int i2 = iArr[i];
                int i3 = iArr2[i];
                long j39 = j17 + j18;
                long j40 = pfb.j(j18, 24, j39);
                long j41 = j19 + j32;
                long j42 = pfb.j(j32, 13, j41);
                long[] jArr5 = jArr3;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j43 = j33;
                long j44 = j21 + j43;
                long j45 = pfb.j(j43, 8, j44);
                int i4 = i;
                long j46 = j34;
                long j47 = j23 + j46;
                long j48 = pfb.j(j46, 47, j47);
                long[] jArr6 = jArr4;
                long j49 = j35;
                long j50 = j25 + j49;
                long j51 = pfb.j(j49, 8, j50);
                long j52 = j36;
                long j53 = j27 + j52;
                long j54 = pfb.j(j52, 17, j53);
                long j55 = j37;
                long j56 = j29 + j55;
                long j57 = pfb.j(j55, 22, j56);
                long j58 = j38;
                long j59 = j31 + j58;
                long j60 = pfb.j(j58, 37, j59);
                long j61 = j39 + j51;
                long j62 = pfb.j(j51, 38, j61);
                long j63 = j41 + j57;
                long j64 = pfb.j(j57, 19, j63);
                long j65 = j47 + j54;
                long j66 = pfb.j(j54, 10, j65);
                long j67 = j44 + j60;
                long j68 = pfb.j(j60, 55, j67);
                long j69 = j53 + j48;
                long j70 = pfb.j(j48, 49, j69);
                long j71 = j56 + j42;
                long j72 = pfb.j(j42, 18, j71);
                long j73 = j59 + j45;
                long j74 = pfb.j(j45, 23, j73);
                long j75 = j50 + j40;
                long j76 = pfb.j(j40, 52, j75);
                long j77 = j61 + j70;
                long j78 = pfb.j(j70, 33, j77);
                long j79 = j63 + j74;
                long j80 = pfb.j(j74, 4, j79);
                long j81 = j67 + j72;
                long j82 = pfb.j(j72, 51, j81);
                long j83 = j65 + j76;
                long j84 = pfb.j(j76, 13, j83);
                long j85 = j71 + j68;
                long j86 = pfb.j(j68, 34, j85);
                long j87 = j73 + j64;
                long j88 = pfb.j(j64, 41, j87);
                long j89 = j75 + j66;
                long j90 = pfb.j(j66, 59, j89);
                long j91 = j69 + j62;
                long j92 = pfb.j(j62, 17, j91);
                long j93 = j77 + j86;
                long j94 = pfb.j(j86, 5, j93);
                long j95 = j79 + j90;
                long j96 = pfb.j(j90, 20, j95);
                long j97 = j83 + j88;
                long j98 = pfb.j(j88, 48, j97);
                long j99 = j81 + j92;
                long j100 = pfb.j(j92, 41, j99);
                long j101 = j87 + j84;
                long j102 = pfb.j(j84, 47, j101);
                long j103 = j89 + j80;
                long j104 = pfb.j(j80, 28, j103);
                long j105 = j91 + j82;
                long j106 = pfb.j(j82, 16, j105);
                long j107 = j85 + j78;
                long j108 = pfb.j(j78, 25, j107);
                long j109 = j93 + jArr5[i2];
                int i5 = i2 + 1;
                long j110 = j102 + jArr5[i5];
                int i6 = i2 + 2;
                int i7 = i2 + 3;
                long j111 = j106 + jArr5[i7];
                int i8 = i2 + 4;
                long j112 = j99 + jArr5[i8];
                int i9 = i2 + 5;
                long j113 = j104 + jArr5[i9];
                int i10 = i2 + 6;
                long j114 = j97 + jArr5[i10];
                int i11 = i2 + 7;
                long j115 = j108 + jArr5[i11];
                int i12 = i2 + 8;
                long j116 = j103 + jArr5[i12];
                int i13 = i2 + 9;
                long j117 = j100 + jArr5[i13];
                int i14 = i2 + 10;
                long j118 = j105 + jArr5[i14];
                int i15 = i2 + 11;
                long j119 = j96 + jArr5[i15];
                int i16 = i2 + 12;
                long j120 = j107 + jArr5[i16];
                int i17 = i2 + 13;
                long j121 = j98 + jArr5[i17] + jArr6[i3];
                int i18 = i2 + 14;
                int i19 = i3 + 1;
                long j122 = j101 + jArr5[i18] + jArr6[i19];
                int i20 = i2 + 15;
                long j123 = i4;
                long j124 = j94 + jArr5[i20] + j123;
                long j125 = j109 + j110;
                long j126 = pfb.j(j110, 41, j125);
                long j127 = j95 + jArr5[i6] + j111;
                long j128 = pfb.j(j111, 9, j127);
                long j129 = j112 + j113;
                long j130 = pfb.j(j113, 37, j129);
                long j131 = j114 + j115;
                long j132 = pfb.j(j115, 31, j131);
                long j133 = j116 + j117;
                long j134 = pfb.j(j117, 12, j133);
                long j135 = j118 + j119;
                long j136 = pfb.j(j119, 47, j135);
                long j137 = j120 + j121;
                long j138 = pfb.j(j121, 44, j137);
                long j139 = j122 + j124;
                long j140 = pfb.j(j124, 30, j139);
                long j141 = j125 + j134;
                long j142 = pfb.j(j134, 16, j141);
                long j143 = j127 + j138;
                long j144 = pfb.j(j138, 34, j143);
                long j145 = j131 + j136;
                long j146 = pfb.j(j136, 56, j145);
                long j147 = j129 + j140;
                long j148 = pfb.j(j140, 51, j147);
                long j149 = j135 + j132;
                long j150 = pfb.j(j132, 4, j149);
                long j151 = j137 + j128;
                long j152 = pfb.j(j128, 53, j151);
                long j153 = j139 + j130;
                long j154 = pfb.j(j130, 42, j153);
                long j155 = j133 + j126;
                long j156 = pfb.j(j126, 41, j155);
                long j157 = j141 + j150;
                long j158 = pfb.j(j150, 31, j157);
                long j159 = j143 + j154;
                long j160 = pfb.j(j154, 44, j159);
                long j161 = j147 + j152;
                long j162 = pfb.j(j152, 47, j161);
                long j163 = j145 + j156;
                long j164 = pfb.j(j156, 46, j163);
                long j165 = j151 + j148;
                long j166 = pfb.j(j148, 19, j165);
                long j167 = j153 + j144;
                long j168 = pfb.j(j144, 42, j167);
                long j169 = j155 + j146;
                long j170 = pfb.j(j146, 44, j169);
                long j171 = j149 + j142;
                long j172 = pfb.j(j142, 25, j171);
                long j173 = j157 + j166;
                long j174 = pfb.j(j166, 9, j173);
                long j175 = j159 + j170;
                long j176 = pfb.j(j170, 48, j175);
                long j177 = j163 + j168;
                long j178 = pfb.j(j168, 35, j177);
                long j179 = j161 + j172;
                long j180 = pfb.j(j172, 52, j179);
                long j181 = j167 + j164;
                long j182 = pfb.j(j164, 23, j181);
                long j183 = j169 + j160;
                long j184 = pfb.j(j160, 31, j183);
                long j185 = j171 + j162;
                long j186 = pfb.j(j162, 37, j185);
                long j187 = j165 + j158;
                long j188 = pfb.j(j158, 20, j187);
                long j189 = j173 + jArr5[i5];
                long j190 = j182 + jArr5[i6];
                long j191 = j175 + jArr5[i7];
                long j192 = j186 + jArr5[i8];
                long j193 = j179 + jArr5[i9];
                j33 = j184 + jArr5[i10];
                long j194 = j177 + jArr5[i11];
                j34 = j188 + jArr5[i12];
                j25 = j183 + jArr5[i13];
                j27 = j185 + jArr5[i15];
                j36 = j176 + jArr5[i16];
                j29 = j187 + jArr5[i17];
                j37 = j178 + jArr5[i18] + jArr6[i19];
                j31 = j181 + jArr5[i20] + jArr6[i3 + 2];
                j38 = j174 + jArr5[i2 + 16] + j123 + 1;
                j35 = j180 + jArr5[i14];
                j21 = j193;
                j32 = j192;
                j23 = j194;
                iArr = iArr3;
                iArr2 = iArr4;
                jArr4 = jArr6;
                jArr3 = jArr5;
                i = i4 + 2;
                j18 = j190;
                j17 = j189;
                j19 = j191;
            }
            jArr2[0] = j17;
            jArr2[1] = j18;
            jArr2[2] = j19;
            jArr2[3] = j32;
            jArr2[4] = j21;
            jArr2[5] = j33;
            jArr2[6] = j23;
            jArr2[7] = j34;
            jArr2[8] = j25;
            jArr2[9] = j35;
            jArr2[10] = j27;
            jArr2[11] = j36;
            jArr2[12] = j29;
            jArr2[13] = j37;
            jArr2[14] = j31;
            jArr2[15] = j38;
        }
    }

    /* renamed from: pfb$b */
    /* loaded from: classes3.dex */
    private static final class b extends d {
        public b(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // defpackage.pfb.d
        void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = pfb.j;
            int[] iArr2 = pfb.k;
            if (jArr3.length == 9) {
                if (jArr4.length == 5) {
                    long j = jArr[0];
                    long j2 = jArr[1];
                    long j3 = jArr[2];
                    long j4 = jArr[3];
                    int i = 17;
                    for (int i2 = 1; i >= i2; i2 = 1) {
                        int i3 = iArr[i];
                        int i4 = iArr2[i];
                        int i5 = i3 + 1;
                        long j5 = j - jArr3[i5];
                        int i6 = i3 + 2;
                        int i7 = i4 + 1;
                        long j6 = j2 - (jArr3[i6] + jArr4[i7]);
                        int i8 = i3 + 3;
                        long j7 = j3 - (jArr3[i8] + jArr4[i4 + 2]);
                        long j8 = i;
                        long n = pfb.n(j4 - ((jArr3[i3 + 4] + j8) + 1), 32, j5);
                        long j9 = j5 - n;
                        int[] iArr3 = iArr;
                        long n2 = pfb.n(j6, 32, j7);
                        long j10 = j7 - n2;
                        long n3 = pfb.n(n2, 58, j9);
                        long j11 = j9 - n3;
                        long n4 = pfb.n(n, 22, j10);
                        long j12 = j10 - n4;
                        long n5 = pfb.n(n4, 46, j11);
                        long j13 = j11 - n5;
                        long n6 = pfb.n(n3, 12, j12);
                        long j14 = j12 - n6;
                        long n7 = pfb.n(n6, 25, j13);
                        long n8 = pfb.n(n5, 33, j14);
                        long j15 = (j13 - n7) - jArr3[i3];
                        long j16 = n7 - (jArr3[i5] + jArr4[i4]);
                        long j17 = (j14 - n8) - (jArr3[i6] + jArr4[i7]);
                        long n9 = pfb.n(n8 - (jArr3[i8] + j8), 5, j15);
                        long j18 = j15 - n9;
                        long n10 = pfb.n(j16, 37, j17);
                        long j19 = j17 - n10;
                        long n11 = pfb.n(n10, 23, j18);
                        long j20 = j18 - n11;
                        long n12 = pfb.n(n9, 40, j19);
                        long j21 = j19 - n12;
                        long n13 = pfb.n(n12, 52, j20);
                        long j22 = j20 - n13;
                        long n14 = pfb.n(n11, 57, j21);
                        long j23 = j21 - n14;
                        long n15 = pfb.n(n14, 14, j22);
                        j = j22 - n15;
                        j4 = pfb.n(n13, 16, j23);
                        j3 = j23 - j4;
                        i -= 2;
                        j2 = n15;
                        iArr = iArr3;
                        iArr2 = iArr2;
                    }
                    long j24 = j2 - (jArr3[1] + jArr4[0]);
                    long j25 = j3 - (jArr3[2] + jArr4[1]);
                    jArr2[0] = j - jArr3[0];
                    jArr2[1] = j24;
                    jArr2[2] = j25;
                    jArr2[3] = j4 - jArr3[3];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        @Override // defpackage.pfb.d
        void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = pfb.j;
            int[] iArr2 = pfb.k;
            if (jArr3.length == 9) {
                if (jArr4.length == 5) {
                    long j = jArr[0];
                    long j2 = jArr[1];
                    long j3 = jArr[2];
                    long j4 = jArr[3];
                    long j5 = j + jArr3[0];
                    long j6 = j2 + jArr3[1] + jArr4[0];
                    long j7 = j3 + jArr3[2] + jArr4[1];
                    long j8 = j4 + jArr3[3];
                    int i = 1;
                    while (i < 18) {
                        int i2 = iArr[i];
                        int i3 = iArr2[i];
                        long j9 = j5 + j6;
                        long j10 = pfb.j(j6, 14, j9);
                        long j11 = j7 + j8;
                        long j12 = pfb.j(j8, 16, j11);
                        long j13 = j9 + j12;
                        long j14 = pfb.j(j12, 52, j13);
                        long j15 = j11 + j10;
                        long j16 = pfb.j(j10, 57, j15);
                        long j17 = j13 + j16;
                        long j18 = pfb.j(j16, 23, j17);
                        long j19 = j15 + j14;
                        long j20 = pfb.j(j14, 40, j19);
                        long j21 = j17 + j20;
                        long j22 = pfb.j(j20, 5, j21);
                        long j23 = j19 + j18;
                        long j24 = pfb.j(j18, 37, j23);
                        long j25 = j21 + jArr3[i2];
                        int i4 = i2 + 1;
                        long j26 = j24 + jArr3[i4] + jArr4[i3];
                        int i5 = i2 + 2;
                        int i6 = i3 + 1;
                        long j27 = j23 + jArr3[i5] + jArr4[i6];
                        int i7 = i2 + 3;
                        int[] iArr3 = iArr;
                        long j28 = i;
                        long j29 = j22 + jArr3[i7] + j28;
                        long j30 = j25 + j26;
                        long j31 = pfb.j(j26, 25, j30);
                        long j32 = j27 + j29;
                        long j33 = pfb.j(j29, 33, j32);
                        long j34 = j30 + j33;
                        long j35 = pfb.j(j33, 46, j34);
                        long j36 = j32 + j31;
                        long j37 = pfb.j(j31, 12, j36);
                        long j38 = j34 + j37;
                        long j39 = pfb.j(j37, 58, j38);
                        long j40 = j36 + j35;
                        long j41 = pfb.j(j35, 22, j40);
                        long j42 = j38 + j41;
                        long j43 = pfb.j(j41, 32, j42);
                        long j44 = j40 + j39;
                        long j45 = pfb.j(j39, 32, j44);
                        j5 = j42 + jArr3[i4];
                        j6 = j45 + jArr3[i5] + jArr4[i6];
                        j7 = j44 + jArr3[i7] + jArr4[i3 + 2];
                        j8 = j43 + jArr3[i2 + 4] + j28 + 1;
                        i += 2;
                        iArr = iArr3;
                        iArr2 = iArr2;
                    }
                    jArr2[0] = j5;
                    jArr2[1] = j6;
                    jArr2[2] = j7;
                    jArr2[3] = j8;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: pfb$c */
    /* loaded from: classes3.dex */
    private static final class c extends d {
        protected c(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // defpackage.pfb.d
        public void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = pfb.h;
            int[] iArr2 = pfb.k;
            if (jArr3.length == 17) {
                if (jArr4.length == 5) {
                    long j = jArr[0];
                    long j2 = jArr[1];
                    long j3 = jArr[2];
                    long j4 = jArr[3];
                    long j5 = jArr[4];
                    long j6 = jArr[5];
                    long j7 = jArr[6];
                    long j8 = jArr[7];
                    int i = 17;
                    for (int i2 = 1; i >= i2; i2 = 1) {
                        int i3 = iArr[i];
                        int i4 = iArr2[i];
                        int i5 = i3 + 1;
                        long j9 = j - jArr3[i5];
                        int i6 = i3 + 2;
                        long j10 = j2 - jArr3[i6];
                        int i7 = i3 + 3;
                        long j11 = j3 - jArr3[i7];
                        int i8 = i3 + 4;
                        long j12 = j4 - jArr3[i8];
                        int i9 = i3 + 5;
                        long j13 = j5 - jArr3[i9];
                        int i10 = i3 + 6;
                        int i11 = i4 + 1;
                        long j14 = j6 - (jArr3[i10] + jArr4[i11]);
                        int i12 = i3 + 7;
                        int[] iArr3 = iArr;
                        int[] iArr4 = iArr2;
                        long j15 = j7 - (jArr3[i12] + jArr4[i4 + 2]);
                        long[] jArr5 = jArr3;
                        long j16 = i;
                        int i13 = i;
                        long n = pfb.n(j10, 8, j15);
                        long j17 = j15 - n;
                        long n2 = pfb.n(j8 - ((jArr3[i3 + 8] + j16) + 1), 35, j9);
                        long j18 = j9 - n2;
                        long n3 = pfb.n(j14, 56, j11);
                        long j19 = j11 - n3;
                        long n4 = pfb.n(j12, 22, j13);
                        long j20 = j13 - n4;
                        long n5 = pfb.n(n, 25, j20);
                        long j21 = j20 - n5;
                        long n6 = pfb.n(n4, 29, j17);
                        long j22 = j17 - n6;
                        long n7 = pfb.n(n3, 39, j18);
                        long j23 = j18 - n7;
                        long n8 = pfb.n(n2, 43, j19);
                        long j24 = j19 - n8;
                        long n9 = pfb.n(n5, 13, j24);
                        long j25 = j24 - n9;
                        long n10 = pfb.n(n8, 50, j21);
                        long j26 = j21 - n10;
                        long n11 = pfb.n(n7, 10, j22);
                        long j27 = j22 - n11;
                        long[] jArr6 = jArr4;
                        long n12 = pfb.n(n6, 17, j23);
                        long j28 = j23 - n12;
                        long n13 = pfb.n(n9, 39, j28);
                        long n14 = pfb.n(n12, 30, j25);
                        long n15 = pfb.n(n11, 34, j26);
                        long n16 = pfb.n(n10, 24, j27);
                        long j29 = (j28 - n13) - jArr5[i3];
                        long j30 = n13 - jArr5[i5];
                        long j31 = (j25 - n14) - jArr5[i6];
                        long j32 = n14 - jArr5[i7];
                        long j33 = (j26 - n15) - jArr5[i8];
                        long j34 = n15 - (jArr5[i9] + jArr6[i4]);
                        long j35 = (j27 - n16) - (jArr5[i10] + jArr6[i11]);
                        long n17 = pfb.n(j30, 44, j35);
                        long j36 = j35 - n17;
                        long n18 = pfb.n(n16 - (jArr5[i12] + j16), 9, j29);
                        long j37 = j29 - n18;
                        long n19 = pfb.n(j34, 54, j31);
                        long j38 = j31 - n19;
                        long n20 = pfb.n(j32, 56, j33);
                        long j39 = j33 - n20;
                        long n21 = pfb.n(n17, 17, j39);
                        long j40 = j39 - n21;
                        long n22 = pfb.n(n20, 49, j36);
                        long j41 = j36 - n22;
                        long n23 = pfb.n(n19, 36, j37);
                        long j42 = j37 - n23;
                        long n24 = pfb.n(n18, 39, j38);
                        long j43 = j38 - n24;
                        long n25 = pfb.n(n21, 33, j43);
                        long j44 = j43 - n25;
                        long n26 = pfb.n(n24, 27, j40);
                        long j45 = j40 - n26;
                        long n27 = pfb.n(n23, 14, j41);
                        long j46 = j41 - n27;
                        long n28 = pfb.n(n22, 42, j42);
                        long j47 = j42 - n28;
                        long n29 = pfb.n(n25, 46, j47);
                        j = j47 - n29;
                        j4 = pfb.n(n28, 36, j44);
                        j6 = pfb.n(n27, 19, j45);
                        j8 = pfb.n(n26, 37, j46);
                        j7 = j46 - j8;
                        i = i13 - 2;
                        j5 = j45 - j6;
                        j3 = j44 - j4;
                        j2 = n29;
                        iArr = iArr3;
                        jArr4 = jArr6;
                        iArr2 = iArr4;
                        jArr3 = jArr5;
                    }
                    long[] jArr7 = jArr3;
                    long[] jArr8 = jArr4;
                    long j48 = j - jArr7[0];
                    long j49 = j2 - jArr7[1];
                    long j50 = j3 - jArr7[2];
                    long j51 = j4 - jArr7[3];
                    long j52 = j5 - jArr7[4];
                    long j53 = j6 - (jArr7[5] + jArr8[0]);
                    long j54 = j7 - (jArr7[6] + jArr8[1]);
                    jArr2[0] = j48;
                    jArr2[1] = j49;
                    jArr2[2] = j50;
                    jArr2[3] = j51;
                    jArr2[4] = j52;
                    jArr2[5] = j53;
                    jArr2[6] = j54;
                    jArr2[7] = j8 - jArr7[7];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        @Override // defpackage.pfb.d
        public void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = pfb.h;
            int[] iArr2 = pfb.k;
            if (jArr3.length == 17) {
                if (jArr4.length == 5) {
                    long j = jArr[0];
                    long j2 = jArr[1];
                    long j3 = jArr[2];
                    long j4 = jArr[3];
                    long j5 = jArr[4];
                    long j6 = jArr[5];
                    long j7 = jArr[6];
                    long j8 = jArr[7];
                    long j9 = j + jArr3[0];
                    long j10 = j2 + jArr3[1];
                    long j11 = j3 + jArr3[2];
                    long j12 = j4 + jArr3[3];
                    long j13 = j5 + jArr3[4];
                    long j14 = j6 + jArr3[5] + jArr4[0];
                    long j15 = j7 + jArr3[6] + jArr4[1];
                    long j16 = j12;
                    long j17 = j14;
                    long j18 = j8 + jArr3[7];
                    int i = 1;
                    while (i < 18) {
                        int i2 = iArr[i];
                        int i3 = iArr2[i];
                        long j19 = j9 + j10;
                        long j20 = pfb.j(j10, 46, j19);
                        long j21 = j11 + j16;
                        long j22 = pfb.j(j16, 36, j21);
                        long j23 = j17;
                        int[] iArr3 = iArr;
                        long j24 = j13 + j23;
                        long j25 = pfb.j(j23, 19, j24);
                        long[] jArr5 = jArr3;
                        long j26 = j18;
                        long j27 = j15 + j26;
                        long j28 = pfb.j(j26, 37, j27);
                        int i4 = i;
                        long j29 = j21 + j20;
                        long j30 = pfb.j(j20, 33, j29);
                        long j31 = j24 + j28;
                        long j32 = pfb.j(j28, 27, j31);
                        long j33 = j27 + j25;
                        long j34 = pfb.j(j25, 14, j33);
                        long j35 = j19 + j22;
                        long j36 = pfb.j(j22, 42, j35);
                        long j37 = j31 + j30;
                        long j38 = pfb.j(j30, 17, j37);
                        long j39 = j33 + j36;
                        long j40 = pfb.j(j36, 49, j39);
                        long j41 = j35 + j34;
                        long j42 = pfb.j(j34, 36, j41);
                        long j43 = j29 + j32;
                        long j44 = pfb.j(j32, 39, j43);
                        long j45 = j39 + j38;
                        long j46 = pfb.j(j38, 44, j45);
                        long j47 = j41 + j44;
                        long j48 = pfb.j(j44, 9, j47);
                        long j49 = j43 + j42;
                        long j50 = pfb.j(j42, 54, j49);
                        long j51 = j37 + j40;
                        long j52 = pfb.j(j40, 56, j51);
                        long j53 = j47 + jArr5[i2];
                        int i5 = i2 + 1;
                        long j54 = j46 + jArr5[i5];
                        int i6 = i2 + 2;
                        long j55 = j49 + jArr5[i6];
                        int i7 = i2 + 3;
                        long j56 = j52 + jArr5[i7];
                        int i8 = i2 + 4;
                        long j57 = j51 + jArr5[i8];
                        int i9 = i2 + 5;
                        long j58 = j50 + jArr5[i9] + jArr4[i3];
                        int i10 = i2 + 6;
                        int i11 = i3 + 1;
                        long j59 = j45 + jArr5[i10] + jArr4[i11];
                        int i12 = i2 + 7;
                        long j60 = i4;
                        long j61 = j48 + jArr5[i12] + j60;
                        long j62 = j53 + j54;
                        long j63 = pfb.j(j54, 39, j62);
                        long j64 = j55 + j56;
                        long j65 = pfb.j(j56, 30, j64);
                        long j66 = j57 + j58;
                        long j67 = pfb.j(j58, 34, j66);
                        long j68 = j59 + j61;
                        long j69 = pfb.j(j61, 24, j68);
                        long j70 = j64 + j63;
                        long j71 = pfb.j(j63, 13, j70);
                        long j72 = j66 + j69;
                        long j73 = pfb.j(j69, 50, j72);
                        long j74 = j68 + j67;
                        long j75 = pfb.j(j67, 10, j74);
                        long j76 = j62 + j65;
                        long j77 = pfb.j(j65, 17, j76);
                        long j78 = j72 + j71;
                        long j79 = pfb.j(j71, 25, j78);
                        long j80 = j74 + j77;
                        long j81 = pfb.j(j77, 29, j80);
                        long j82 = j76 + j75;
                        long j83 = pfb.j(j75, 39, j82);
                        long j84 = j70 + j73;
                        long[] jArr6 = jArr4;
                        long j85 = pfb.j(j73, 43, j84);
                        long j86 = j80 + j79;
                        long j87 = pfb.j(j79, 8, j86);
                        long j88 = j82 + j85;
                        long j89 = pfb.j(j85, 35, j88);
                        long j90 = j84 + j83;
                        long j91 = pfb.j(j83, 56, j90);
                        long j92 = j78 + j81;
                        long j93 = pfb.j(j81, 22, j92);
                        long j94 = j88 + jArr5[i5];
                        j10 = j87 + jArr5[i6];
                        j16 = j93 + jArr5[i8];
                        long j95 = j92 + jArr5[i9];
                        j17 = j91 + jArr5[i10] + jArr6[i11];
                        long j96 = j86 + jArr5[i12] + jArr6[i3 + 2];
                        long j97 = j89 + jArr5[i2 + 8] + j60 + 1;
                        j15 = j96;
                        j13 = j95;
                        jArr3 = jArr5;
                        iArr = iArr3;
                        jArr4 = jArr6;
                        j18 = j97;
                        j11 = j90 + jArr5[i7];
                        j9 = j94;
                        i = i4 + 2;
                        iArr2 = iArr2;
                    }
                    jArr2[0] = j9;
                    jArr2[1] = j10;
                    jArr2[2] = j11;
                    jArr2[3] = j16;
                    jArr2[4] = j13;
                    jArr2[5] = j17;
                    jArr2[6] = j15;
                    jArr2[7] = j18;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pfb$d */
    /* loaded from: classes3.dex */
    public static abstract class d {
        protected final long[] a;
        protected final long[] b;

        protected d(long[] jArr, long[] jArr2) {
            this.b = jArr;
            this.a = jArr2;
        }

        abstract void a(long[] jArr, long[] jArr2);

        abstract void b(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        h = iArr;
        i = new int[iArr.length];
        j = new int[iArr.length];
        k = new int[iArr.length];
        int i2 = 0;
        while (true) {
            int[] iArr2 = h;
            if (i2 < iArr2.length) {
                i[i2] = i2 % 17;
                iArr2[i2] = i2 % 9;
                j[i2] = i2 % 5;
                k[i2] = i2 % 3;
                i2++;
            } else {
                return;
            }
        }
    }

    public pfb(int i2) {
        d bVar;
        long[] jArr = new long[5];
        this.d = jArr;
        int i3 = i2 / 8;
        this.a = i3;
        int i4 = i3 / 8;
        this.b = i4;
        this.c = new long[i4];
        long[] jArr2 = new long[(i4 * 2) + 1];
        this.e = jArr2;
        if (i2 != 256) {
            if (i2 != 512) {
                if (i2 == 1024) {
                    bVar = new a(jArr2, jArr);
                } else {
                    throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
                }
            } else {
                bVar = new c(jArr2, jArr);
            }
        } else {
            bVar = new b(jArr2, jArr);
        }
        this.f = bVar;
    }

    public static long g(byte[] bArr, int i2) {
        if (i2 + 8 <= bArr.length) {
            long j2 = (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32);
            int i3 = i2 + 6;
            return ((bArr[i2 + 7] & 255) << 56) | j2 | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i3] & 255) << 48);
        }
        throw new IllegalArgumentException();
    }

    static long j(long j2, int i2, long j3) {
        return ((j2 >>> (-i2)) | (j2 << i2)) ^ j3;
    }

    private void k(long[] jArr) {
        if (jArr.length == this.b) {
            long j2 = 2004413935125273122L;
            int i2 = 0;
            while (true) {
                int i3 = this.b;
                if (i2 < i3) {
                    long[] jArr2 = this.e;
                    long j3 = jArr[i2];
                    jArr2[i2] = j3;
                    j2 ^= j3;
                    i2++;
                } else {
                    long[] jArr3 = this.e;
                    jArr3[i3] = j2;
                    System.arraycopy(jArr3, 0, jArr3, i3 + 1, i3);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.b + " words)");
        }
    }

    private void l(long[] jArr) {
        if (jArr.length == 2) {
            long[] jArr2 = this.d;
            long j2 = jArr[0];
            jArr2[0] = j2;
            long j3 = jArr[1];
            jArr2[1] = j3;
            jArr2[2] = j2 ^ j3;
            jArr2[3] = j2;
            jArr2[4] = j3;
            return;
        }
        throw new IllegalArgumentException("Tweak must be 2 words.");
    }

    public static void m(long j2, byte[] bArr, int i2) {
        if (i2 + 8 <= bArr.length) {
            bArr[i2] = (byte) j2;
            bArr[i2 + 1] = (byte) (j2 >> 8);
            bArr[i2 + 2] = (byte) (j2 >> 16);
            bArr[i2 + 3] = (byte) (j2 >> 24);
            bArr[i2 + 4] = (byte) (j2 >> 32);
            bArr[i2 + 5] = (byte) (j2 >> 40);
            bArr[i2 + 6] = (byte) (j2 >> 48);
            bArr[i2 + 7] = (byte) (j2 >> 56);
            return;
        }
        throw new IllegalArgumentException();
    }

    static long n(long j2, int i2, long j3) {
        long j4 = j2 ^ j3;
        return (j4 << (-i2)) | (j4 >>> i2);
    }

    @Override // defpackage.xc0
    public int a() {
        return this.a;
    }

    @Override // defpackage.xc0
    public int b(byte[] bArr, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        int i4 = this.a;
        if (i2 + i4 <= bArr.length) {
            if (i4 + i3 <= bArr2.length) {
                int i5 = 0;
                for (int i6 = 0; i6 < this.a; i6 += 8) {
                    this.c[i6 >> 3] = g(bArr, i2 + i6);
                }
                long[] jArr = this.c;
                i(jArr, jArr);
                while (true) {
                    int i7 = this.a;
                    if (i5 < i7) {
                        m(this.c[i5 >> 3], bArr2, i3 + i5);
                        i5 += 8;
                    } else {
                        return i7;
                    }
                }
            } else {
                throw new OutputLengthException("Output buffer too short");
            }
        } else {
            throw new DataLengthException("Input buffer too short");
        }
    }

    @Override // defpackage.xc0
    public String getAlgorithmName() {
        return "Threefish-" + (this.a * 8);
    }

    public void h(boolean z, long[] jArr, long[] jArr2) {
        this.g = z;
        if (jArr != null) {
            k(jArr);
        }
        if (jArr2 != null) {
            l(jArr2);
        }
    }

    public int i(long[] jArr, long[] jArr2) throws DataLengthException, IllegalStateException {
        long[] jArr3 = this.e;
        int i2 = this.b;
        if (jArr3[i2] != 0) {
            if (jArr.length == i2) {
                if (jArr2.length == i2) {
                    if (this.g) {
                        this.f.b(jArr, jArr2);
                    } else {
                        this.f.a(jArr, jArr2);
                    }
                    return this.b;
                }
                throw new OutputLengthException("Output buffer too short");
            }
            throw new DataLengthException("Input buffer too short");
        }
        throw new IllegalStateException("Threefish engine not initialised");
    }

    @Override // defpackage.xc0
    public void init(boolean z, v71 v71Var) throws IllegalArgumentException {
        byte[] a2;
        byte[] bArr;
        long[] jArr;
        long[] jArr2 = null;
        if (v71Var instanceof mnb) {
            mnb mnbVar = (mnb) v71Var;
            a2 = mnbVar.a().a();
            bArr = mnbVar.b();
        } else if (v71Var instanceof lf5) {
            a2 = ((lf5) v71Var).a();
            bArr = null;
        } else {
            throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + v71Var.getClass().getName());
        }
        if (a2 != null) {
            if (a2.length == this.a) {
                int i2 = this.b;
                jArr = new long[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    jArr[i3] = g(a2, i3 * 8);
                }
            } else {
                throw new IllegalArgumentException("Threefish key must be same size as block (" + this.a + " bytes)");
            }
        } else {
            jArr = null;
        }
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{g(bArr, 0), g(bArr, 8)};
        }
        h(z, jArr, jArr2);
    }

    @Override // defpackage.xc0
    public void reset() {
    }
}
