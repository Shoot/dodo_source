package defpackage;
/* renamed from: d39  reason: default package */
/* loaded from: classes3.dex */
public class d39 extends ed4 {
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int[] i;
    private int j;

    public d39() {
        this.i = new int[16];
        reset();
    }

    private int i(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private void j(d39 d39Var) {
        super.d(d39Var);
        this.d = d39Var.d;
        this.e = d39Var.e;
        this.f = d39Var.f;
        this.g = d39Var.g;
        this.h = d39Var.h;
        int[] iArr = d39Var.i;
        System.arraycopy(iArr, 0, this.i, 0, iArr.length);
        this.j = d39Var.j;
    }

    private int k(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int l(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int m(int i, int i2, int i3) {
        return (i | (~i2)) ^ i3;
    }

    private int n(int i, int i2, int i3) {
        return (i & i3) | (i2 & (~i3));
    }

    private int o(int i, int i2, int i3) {
        return i ^ (i2 | (~i3));
    }

    private void p(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new d39(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        j((d39) sc6Var);
    }

    @Override // defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        e();
        p(this.d, bArr, i);
        p(this.e, bArr, i + 4);
        p(this.f, bArr, i + 8);
        p(this.g, bArr, i + 12);
        p(this.h, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // defpackage.ed4
    protected void f() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        int i5 = this.h;
        int i6 = i(k(i2, i3, i4) + i + this.i[0], 11) + i5;
        int i7 = i(i3, 10);
        int i8 = i(k(i6, i2, i7) + i5 + this.i[1], 14) + i4;
        int i9 = i(i2, 10);
        int i10 = i(k(i8, i6, i9) + i4 + this.i[2], 15) + i7;
        int i11 = i(i6, 10);
        int i12 = i(i7 + k(i10, i8, i11) + this.i[3], 12) + i9;
        int i13 = i(i8, 10);
        int i14 = i(i9 + k(i12, i10, i13) + this.i[4], 5) + i11;
        int i15 = i(i10, 10);
        int i16 = i(i11 + k(i14, i12, i15) + this.i[5], 8) + i13;
        int i17 = i(i12, 10);
        int i18 = i(i13 + k(i16, i14, i17) + this.i[6], 7) + i15;
        int i19 = i(i14, 10);
        int i20 = i(i15 + k(i18, i16, i19) + this.i[7], 9) + i17;
        int i21 = i(i16, 10);
        int i22 = i(i17 + k(i20, i18, i21) + this.i[8], 11) + i19;
        int i23 = i(i18, 10);
        int i24 = i(i19 + k(i22, i20, i23) + this.i[9], 13) + i21;
        int i25 = i(i20, 10);
        int i26 = i(i21 + k(i24, i22, i25) + this.i[10], 14) + i23;
        int i27 = i(i22, 10);
        int i28 = i(i23 + k(i26, i24, i27) + this.i[11], 15) + i25;
        int i29 = i(i24, 10);
        int i30 = i(i25 + k(i28, i26, i29) + this.i[12], 6) + i27;
        int i31 = i(i26, 10);
        int i32 = i(i27 + k(i30, i28, i31) + this.i[13], 7) + i29;
        int i33 = i(i28, 10);
        int i34 = i(i29 + k(i32, i30, i33) + this.i[14], 9) + i31;
        int i35 = i(i30, 10);
        int i36 = i(i31 + k(i34, i32, i35) + this.i[15], 8) + i33;
        int i37 = i(i32, 10);
        int i38 = i(i + o(i2, i3, i4) + this.i[5] + 1352829926, 8) + i5;
        int i39 = i(i3, 10);
        int i40 = i(i5 + o(i38, i2, i39) + this.i[14] + 1352829926, 9) + i4;
        int i41 = i(i2, 10);
        int i42 = i(i4 + o(i40, i38, i41) + this.i[7] + 1352829926, 9) + i39;
        int i43 = i(i38, 10);
        int i44 = i(i39 + o(i42, i40, i43) + this.i[0] + 1352829926, 11) + i41;
        int i45 = i(i40, 10);
        int i46 = i(i41 + o(i44, i42, i45) + this.i[9] + 1352829926, 13) + i43;
        int i47 = i(i42, 10);
        int i48 = i(i43 + o(i46, i44, i47) + this.i[2] + 1352829926, 15) + i45;
        int i49 = i(i44, 10);
        int i50 = i(i45 + o(i48, i46, i49) + this.i[11] + 1352829926, 15) + i47;
        int i51 = i(i46, 10);
        int i52 = i(i47 + o(i50, i48, i51) + this.i[4] + 1352829926, 5) + i49;
        int i53 = i(i48, 10);
        int i54 = i(i49 + o(i52, i50, i53) + this.i[13] + 1352829926, 7) + i51;
        int i55 = i(i50, 10);
        int i56 = i(i51 + o(i54, i52, i55) + this.i[6] + 1352829926, 7) + i53;
        int i57 = i(i52, 10);
        int i58 = i(i53 + o(i56, i54, i57) + this.i[15] + 1352829926, 8) + i55;
        int i59 = i(i54, 10);
        int i60 = i(i55 + o(i58, i56, i59) + this.i[8] + 1352829926, 11) + i57;
        int i61 = i(i56, 10);
        int i62 = i(i57 + o(i60, i58, i61) + this.i[1] + 1352829926, 14) + i59;
        int i63 = i(i58, 10);
        int i64 = i(i59 + o(i62, i60, i63) + this.i[10] + 1352829926, 14) + i61;
        int i65 = i(i60, 10);
        int i66 = i(i61 + o(i64, i62, i65) + this.i[3] + 1352829926, 12) + i63;
        int i67 = i(i62, 10);
        int i68 = i(i63 + o(i66, i64, i67) + this.i[12] + 1352829926, 6) + i65;
        int i69 = i(i64, 10);
        int i70 = i(i33 + l(i36, i34, i37) + this.i[7] + 1518500249, 7) + i35;
        int i71 = i(i34, 10);
        int i72 = i(i35 + l(i70, i36, i71) + this.i[4] + 1518500249, 6) + i37;
        int i73 = i(i36, 10);
        int i74 = i(i37 + l(i72, i70, i73) + this.i[13] + 1518500249, 8) + i71;
        int i75 = i(i70, 10);
        int i76 = i(i71 + l(i74, i72, i75) + this.i[1] + 1518500249, 13) + i73;
        int i77 = i(i72, 10);
        int i78 = i(i73 + l(i76, i74, i77) + this.i[10] + 1518500249, 11) + i75;
        int i79 = i(i74, 10);
        int i80 = i(i75 + l(i78, i76, i79) + this.i[6] + 1518500249, 9) + i77;
        int i81 = i(i76, 10);
        int i82 = i(i77 + l(i80, i78, i81) + this.i[15] + 1518500249, 7) + i79;
        int i83 = i(i78, 10);
        int i84 = i(i79 + l(i82, i80, i83) + this.i[3] + 1518500249, 15) + i81;
        int i85 = i(i80, 10);
        int i86 = i(i81 + l(i84, i82, i85) + this.i[12] + 1518500249, 7) + i83;
        int i87 = i(i82, 10);
        int i88 = i(i83 + l(i86, i84, i87) + this.i[0] + 1518500249, 12) + i85;
        int i89 = i(i84, 10);
        int i90 = i(i85 + l(i88, i86, i89) + this.i[9] + 1518500249, 15) + i87;
        int i91 = i(i86, 10);
        int i92 = i(i87 + l(i90, i88, i91) + this.i[5] + 1518500249, 9) + i89;
        int i93 = i(i88, 10);
        int i94 = i(i89 + l(i92, i90, i93) + this.i[2] + 1518500249, 11) + i91;
        int i95 = i(i90, 10);
        int i96 = i(i91 + l(i94, i92, i95) + this.i[14] + 1518500249, 7) + i93;
        int i97 = i(i92, 10);
        int i98 = i(i93 + l(i96, i94, i97) + this.i[11] + 1518500249, 13) + i95;
        int i99 = i(i94, 10);
        int i100 = i(i95 + l(i98, i96, i99) + this.i[8] + 1518500249, 12) + i97;
        int i101 = i(i96, 10);
        int i102 = i(i65 + n(i68, i66, i69) + this.i[6] + 1548603684, 9) + i67;
        int i103 = i(i66, 10);
        int i104 = i(i67 + n(i102, i68, i103) + this.i[11] + 1548603684, 13) + i69;
        int i105 = i(i68, 10);
        int i106 = i(i69 + n(i104, i102, i105) + this.i[3] + 1548603684, 15) + i103;
        int i107 = i(i102, 10);
        int i108 = i(i103 + n(i106, i104, i107) + this.i[7] + 1548603684, 7) + i105;
        int i109 = i(i104, 10);
        int i110 = i(i105 + n(i108, i106, i109) + this.i[0] + 1548603684, 12) + i107;
        int i111 = i(i106, 10);
        int i112 = i(i107 + n(i110, i108, i111) + this.i[13] + 1548603684, 8) + i109;
        int i113 = i(i108, 10);
        int i114 = i(i109 + n(i112, i110, i113) + this.i[5] + 1548603684, 9) + i111;
        int i115 = i(i110, 10);
        int i116 = i(i111 + n(i114, i112, i115) + this.i[10] + 1548603684, 11) + i113;
        int i117 = i(i112, 10);
        int i118 = i(i113 + n(i116, i114, i117) + this.i[14] + 1548603684, 7) + i115;
        int i119 = i(i114, 10);
        int i120 = i(i115 + n(i118, i116, i119) + this.i[15] + 1548603684, 7) + i117;
        int i121 = i(i116, 10);
        int i122 = i(i117 + n(i120, i118, i121) + this.i[8] + 1548603684, 12) + i119;
        int i123 = i(i118, 10);
        int i124 = i(i119 + n(i122, i120, i123) + this.i[12] + 1548603684, 7) + i121;
        int i125 = i(i120, 10);
        int i126 = i(i121 + n(i124, i122, i125) + this.i[4] + 1548603684, 6) + i123;
        int i127 = i(i122, 10);
        int i128 = i(i123 + n(i126, i124, i127) + this.i[9] + 1548603684, 15) + i125;
        int i129 = i(i124, 10);
        int i130 = i(i125 + n(i128, i126, i129) + this.i[1] + 1548603684, 13) + i127;
        int i131 = i(i126, 10);
        int i132 = i(i127 + n(i130, i128, i131) + this.i[2] + 1548603684, 11) + i129;
        int i133 = i(i128, 10);
        int i134 = i(i97 + m(i100, i98, i101) + this.i[3] + 1859775393, 11) + i99;
        int i135 = i(i98, 10);
        int i136 = i(i99 + m(i134, i100, i135) + this.i[10] + 1859775393, 13) + i101;
        int i137 = i(i100, 10);
        int i138 = i(i101 + m(i136, i134, i137) + this.i[14] + 1859775393, 6) + i135;
        int i139 = i(i134, 10);
        int i140 = i(i135 + m(i138, i136, i139) + this.i[4] + 1859775393, 7) + i137;
        int i141 = i(i136, 10);
        int i142 = i(i137 + m(i140, i138, i141) + this.i[9] + 1859775393, 14) + i139;
        int i143 = i(i138, 10);
        int i144 = i(i139 + m(i142, i140, i143) + this.i[15] + 1859775393, 9) + i141;
        int i145 = i(i140, 10);
        int i146 = i(i141 + m(i144, i142, i145) + this.i[8] + 1859775393, 13) + i143;
        int i147 = i(i142, 10);
        int i148 = i(i143 + m(i146, i144, i147) + this.i[1] + 1859775393, 15) + i145;
        int i149 = i(i144, 10);
        int i150 = i(i145 + m(i148, i146, i149) + this.i[2] + 1859775393, 14) + i147;
        int i151 = i(i146, 10);
        int i152 = i(i147 + m(i150, i148, i151) + this.i[7] + 1859775393, 8) + i149;
        int i153 = i(i148, 10);
        int i154 = i(i149 + m(i152, i150, i153) + this.i[0] + 1859775393, 13) + i151;
        int i155 = i(i150, 10);
        int i156 = i(i151 + m(i154, i152, i155) + this.i[6] + 1859775393, 6) + i153;
        int i157 = i(i152, 10);
        int i158 = i(i153 + m(i156, i154, i157) + this.i[13] + 1859775393, 5) + i155;
        int i159 = i(i154, 10);
        int i160 = i(i155 + m(i158, i156, i159) + this.i[11] + 1859775393, 12) + i157;
        int i161 = i(i156, 10);
        int i162 = i(i157 + m(i160, i158, i161) + this.i[5] + 1859775393, 7) + i159;
        int i163 = i(i158, 10);
        int i164 = i(i159 + m(i162, i160, i163) + this.i[12] + 1859775393, 5) + i161;
        int i165 = i(i160, 10);
        int i166 = i(i129 + m(i132, i130, i133) + this.i[15] + 1836072691, 9) + i131;
        int i167 = i(i130, 10);
        int i168 = i(i131 + m(i166, i132, i167) + this.i[5] + 1836072691, 7) + i133;
        int i169 = i(i132, 10);
        int i170 = i(i133 + m(i168, i166, i169) + this.i[1] + 1836072691, 15) + i167;
        int i171 = i(i166, 10);
        int i172 = i(i167 + m(i170, i168, i171) + this.i[3] + 1836072691, 11) + i169;
        int i173 = i(i168, 10);
        int i174 = i(i169 + m(i172, i170, i173) + this.i[7] + 1836072691, 8) + i171;
        int i175 = i(i170, 10);
        int i176 = i(i171 + m(i174, i172, i175) + this.i[14] + 1836072691, 6) + i173;
        int i177 = i(i172, 10);
        int i178 = i(i173 + m(i176, i174, i177) + this.i[6] + 1836072691, 6) + i175;
        int i179 = i(i174, 10);
        int i180 = i(i175 + m(i178, i176, i179) + this.i[9] + 1836072691, 14) + i177;
        int i181 = i(i176, 10);
        int i182 = i(i177 + m(i180, i178, i181) + this.i[11] + 1836072691, 12) + i179;
        int i183 = i(i178, 10);
        int i184 = i(i179 + m(i182, i180, i183) + this.i[8] + 1836072691, 13) + i181;
        int i185 = i(i180, 10);
        int i186 = i(i181 + m(i184, i182, i185) + this.i[12] + 1836072691, 5) + i183;
        int i187 = i(i182, 10);
        int i188 = i(i183 + m(i186, i184, i187) + this.i[2] + 1836072691, 14) + i185;
        int i189 = i(i184, 10);
        int i190 = i(i185 + m(i188, i186, i189) + this.i[10] + 1836072691, 13) + i187;
        int i191 = i(i186, 10);
        int i192 = i(i187 + m(i190, i188, i191) + this.i[0] + 1836072691, 13) + i189;
        int i193 = i(i188, 10);
        int i194 = i(i189 + m(i192, i190, i193) + this.i[4] + 1836072691, 7) + i191;
        int i195 = i(i190, 10);
        int i196 = i(i191 + m(i194, i192, i195) + this.i[13] + 1836072691, 5) + i193;
        int i197 = i(i192, 10);
        int i198 = i(((i161 + n(i164, i162, i165)) + this.i[1]) - 1894007588, 11) + i163;
        int i199 = i(i162, 10);
        int i200 = i(((i163 + n(i198, i164, i199)) + this.i[9]) - 1894007588, 12) + i165;
        int i201 = i(i164, 10);
        int i202 = i(((i165 + n(i200, i198, i201)) + this.i[11]) - 1894007588, 14) + i199;
        int i203 = i(i198, 10);
        int i204 = i(((i199 + n(i202, i200, i203)) + this.i[10]) - 1894007588, 15) + i201;
        int i205 = i(i200, 10);
        int i206 = i(((i201 + n(i204, i202, i205)) + this.i[0]) - 1894007588, 14) + i203;
        int i207 = i(i202, 10);
        int i208 = i(((i203 + n(i206, i204, i207)) + this.i[8]) - 1894007588, 15) + i205;
        int i209 = i(i204, 10);
        int i210 = i(((i205 + n(i208, i206, i209)) + this.i[12]) - 1894007588, 9) + i207;
        int i211 = i(i206, 10);
        int i212 = i(((i207 + n(i210, i208, i211)) + this.i[4]) - 1894007588, 8) + i209;
        int i213 = i(i208, 10);
        int i214 = i(((i209 + n(i212, i210, i213)) + this.i[13]) - 1894007588, 9) + i211;
        int i215 = i(i210, 10);
        int i216 = i(((i211 + n(i214, i212, i215)) + this.i[3]) - 1894007588, 14) + i213;
        int i217 = i(i212, 10);
        int i218 = i(((i213 + n(i216, i214, i217)) + this.i[7]) - 1894007588, 5) + i215;
        int i219 = i(i214, 10);
        int i220 = i(((i215 + n(i218, i216, i219)) + this.i[15]) - 1894007588, 6) + i217;
        int i221 = i(i216, 10);
        int i222 = i(((i217 + n(i220, i218, i221)) + this.i[14]) - 1894007588, 8) + i219;
        int i223 = i(i218, 10);
        int i224 = i(((i219 + n(i222, i220, i223)) + this.i[5]) - 1894007588, 6) + i221;
        int i225 = i(i220, 10);
        int i226 = i(((i221 + n(i224, i222, i225)) + this.i[6]) - 1894007588, 5) + i223;
        int i227 = i(i222, 10);
        int i228 = i(((i223 + n(i226, i224, i227)) + this.i[2]) - 1894007588, 12) + i225;
        int i229 = i(i224, 10);
        int i230 = i(i193 + l(i196, i194, i197) + this.i[8] + 2053994217, 15) + i195;
        int i231 = i(i194, 10);
        int i232 = i(i195 + l(i230, i196, i231) + this.i[6] + 2053994217, 5) + i197;
        int i233 = i(i196, 10);
        int i234 = i(i197 + l(i232, i230, i233) + this.i[4] + 2053994217, 8) + i231;
        int i235 = i(i230, 10);
        int i236 = i(i231 + l(i234, i232, i235) + this.i[1] + 2053994217, 11) + i233;
        int i237 = i(i232, 10);
        int i238 = i(i233 + l(i236, i234, i237) + this.i[3] + 2053994217, 14) + i235;
        int i239 = i(i234, 10);
        int i240 = i(i235 + l(i238, i236, i239) + this.i[11] + 2053994217, 14) + i237;
        int i241 = i(i236, 10);
        int i242 = i(i237 + l(i240, i238, i241) + this.i[15] + 2053994217, 6) + i239;
        int i243 = i(i238, 10);
        int i244 = i(i239 + l(i242, i240, i243) + this.i[0] + 2053994217, 14) + i241;
        int i245 = i(i240, 10);
        int i246 = i(i241 + l(i244, i242, i245) + this.i[5] + 2053994217, 6) + i243;
        int i247 = i(i242, 10);
        int i248 = i(i243 + l(i246, i244, i247) + this.i[12] + 2053994217, 9) + i245;
        int i249 = i(i244, 10);
        int i250 = i(i245 + l(i248, i246, i249) + this.i[2] + 2053994217, 12) + i247;
        int i251 = i(i246, 10);
        int i252 = i(i247 + l(i250, i248, i251) + this.i[13] + 2053994217, 9) + i249;
        int i253 = i(i248, 10);
        int i254 = i(i249 + l(i252, i250, i253) + this.i[9] + 2053994217, 12) + i251;
        int i255 = i(i250, 10);
        int i256 = i(i251 + l(i254, i252, i255) + this.i[7] + 2053994217, 5) + i253;
        int i257 = i(i252, 10);
        int i258 = i(i253 + l(i256, i254, i257) + this.i[10] + 2053994217, 15) + i255;
        int i259 = i(i254, 10);
        int i260 = i(i255 + l(i258, i256, i259) + this.i[14] + 2053994217, 8) + i257;
        int i261 = i(i256, 10);
        int i262 = i(((i225 + o(i228, i226, i229)) + this.i[4]) - 1454113458, 9) + i227;
        int i263 = i(i226, 10);
        int i264 = i(((i227 + o(i262, i228, i263)) + this.i[0]) - 1454113458, 15) + i229;
        int i265 = i(i228, 10);
        int i266 = i(((i229 + o(i264, i262, i265)) + this.i[5]) - 1454113458, 5) + i263;
        int i267 = i(i262, 10);
        int i268 = i(((i263 + o(i266, i264, i267)) + this.i[9]) - 1454113458, 11) + i265;
        int i269 = i(i264, 10);
        int i270 = i(((i265 + o(i268, i266, i269)) + this.i[7]) - 1454113458, 6) + i267;
        int i271 = i(i266, 10);
        int i272 = i(((i267 + o(i270, i268, i271)) + this.i[12]) - 1454113458, 8) + i269;
        int i273 = i(i268, 10);
        int i274 = i(((i269 + o(i272, i270, i273)) + this.i[2]) - 1454113458, 13) + i271;
        int i275 = i(i270, 10);
        int i276 = i(((i271 + o(i274, i272, i275)) + this.i[10]) - 1454113458, 12) + i273;
        int i277 = i(i272, 10);
        int i278 = i(((i273 + o(i276, i274, i277)) + this.i[14]) - 1454113458, 5) + i275;
        int i279 = i(i274, 10);
        int i280 = i(((i275 + o(i278, i276, i279)) + this.i[1]) - 1454113458, 12) + i277;
        int i281 = i(i276, 10);
        int i282 = i(((i277 + o(i280, i278, i281)) + this.i[3]) - 1454113458, 13) + i279;
        int i283 = i(i278, 10);
        int i284 = i(((i279 + o(i282, i280, i283)) + this.i[8]) - 1454113458, 14) + i281;
        int i285 = i(i280, 10);
        int i286 = i(((i281 + o(i284, i282, i285)) + this.i[11]) - 1454113458, 11) + i283;
        int i287 = i(i282, 10);
        int i288 = i(((i283 + o(i286, i284, i287)) + this.i[6]) - 1454113458, 8) + i285;
        int i289 = i(i284, 10);
        int i290 = i(((i285 + o(i288, i286, i289)) + this.i[15]) - 1454113458, 5) + i287;
        int i291 = i(i286, 10);
        int i292 = i(i288, 10);
        int i293 = i(i257 + k(i260, i258, i261) + this.i[12], 8) + i259;
        int i294 = i(i258, 10);
        int i295 = i(i259 + k(i293, i260, i294) + this.i[15], 5) + i261;
        int i296 = i(i260, 10);
        int i297 = i(i261 + k(i295, i293, i296) + this.i[10], 12) + i294;
        int i298 = i(i293, 10);
        int i299 = i(i294 + k(i297, i295, i298) + this.i[4], 9) + i296;
        int i300 = i(i295, 10);
        int i301 = i(i296 + k(i299, i297, i300) + this.i[1], 12) + i298;
        int i302 = i(i297, 10);
        int i303 = i(i298 + k(i301, i299, i302) + this.i[5], 5) + i300;
        int i304 = i(i299, 10);
        int i305 = i(i300 + k(i303, i301, i304) + this.i[8], 14) + i302;
        int i306 = i(i301, 10);
        int i307 = i(i302 + k(i305, i303, i306) + this.i[7], 6) + i304;
        int i308 = i(i303, 10);
        int i309 = i(i304 + k(i307, i305, i308) + this.i[6], 8) + i306;
        int i310 = i(i305, 10);
        int i311 = i(i306 + k(i309, i307, i310) + this.i[2], 13) + i308;
        int i312 = i(i307, 10);
        int i313 = i(i308 + k(i311, i309, i312) + this.i[13], 6) + i310;
        int i314 = i(i309, 10);
        int i315 = i(i310 + k(i313, i311, i314) + this.i[14], 5) + i312;
        int i316 = i(i311, 10);
        int i317 = i(i312 + k(i315, i313, i316) + this.i[0], 15) + i314;
        int i318 = i(i313, 10);
        int i319 = i(i314 + k(i317, i315, i318) + this.i[3], 13) + i316;
        int i320 = i(i315, 10);
        int i321 = i(i316 + k(i319, i317, i320) + this.i[9], 11) + i318;
        int i322 = i(i317, 10);
        int i323 = i(i318 + k(i321, i319, i322) + this.i[11], 11) + i320;
        this.e = this.f + i292 + i322;
        this.f = this.g + i291 + i320;
        this.g = this.h + i289 + i323;
        this.h = this.d + i(((i287 + o(i290, i288, i291)) + this.i[13]) - 1454113458, 6) + i289 + i321;
        this.d = i(i319, 10) + i290 + this.e;
        this.j = 0;
        int i324 = 0;
        while (true) {
            int[] iArr = this.i;
            if (i324 == iArr.length) {
                return;
            }
            iArr[i324] = 0;
            i324++;
        }
    }

    @Override // defpackage.ed4
    protected void g(long j) {
        if (this.j > 14) {
            f();
        }
        int[] iArr = this.i;
        iArr[14] = (int) j;
        iArr[15] = (int) (j >>> 32);
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "RIPEMD160";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 20;
    }

    @Override // defpackage.ed4
    protected void h(byte[] bArr, int i) {
        int[] iArr = this.i;
        int i2 = this.j;
        int i3 = i2 + 1;
        this.j = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            f();
        }
    }

    @Override // defpackage.ed4, defpackage.e23
    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.j = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.i;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public d39(d39 d39Var) {
        super(d39Var);
        this.i = new int[16];
        j(d39Var);
    }
}
