package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: TileSourceFactory.java */
/* renamed from: zfb  reason: default package */
/* loaded from: classes3.dex */
public class zfb {
    public static final da7 a;
    public static final da7 b;
    public static final da7 c;
    public static final da7 d;
    public static final da7 e;
    public static final da7 f;
    public static final da7 g;
    public static final da7 h;
    public static final da7 i;
    public static final da7 j;
    public static final da7 k;
    public static final da7 l;
    public static final da7 m;
    public static final da7 n;
    public static final da7 o;
    public static final da7 p;
    public static final da7 q;
    private static List<org.osmdroid.tileprovider.tilesource.a> r;

    /* compiled from: TileSourceFactory.java */
    /* renamed from: zfb$a */
    /* loaded from: classes3.dex */
    class a extends da7 {
        a(String str, int i, int i2, int i3, String str2, String[] strArr, String str3) {
            super(str, i, i2, i3, str2, strArr, str3);
        }

        @Override // defpackage.da7
        public String m(long j) {
            return k() + k76.e(j) + "/" + k76.d(j) + "/" + k76.c(j);
        }
    }

    /* compiled from: TileSourceFactory.java */
    /* renamed from: zfb$b */
    /* loaded from: classes3.dex */
    class b extends da7 {
        b(String str, int i, int i2, int i3, String str2, String[] strArr, String str3) {
            super(str, i, i2, i3, str2, strArr, str3);
        }

        @Override // defpackage.da7
        public String m(long j) {
            return k() + k76.e(j) + "/" + k76.d(j) + "/" + k76.c(j);
        }
    }

    static {
        vbc vbcVar = new vbc("Mapnik", 0, 19, 256, ".png", new String[]{"https://a.tile.openstreetmap.org/", "https://b.tile.openstreetmap.org/", "https://c.tile.openstreetmap.org/"}, "© OpenStreetMap contributors", new agb(2, 15));
        a = vbcVar;
        vbc vbcVar2 = new vbc("Wikimedia", 1, 19, 256, ".png", new String[]{"https://maps.wikimedia.org/osm-intl/"}, "Wikimedia maps | Map data © OpenStreetMap contributors", new agb(1, 15));
        b = vbcVar2;
        vbc vbcVar3 = new vbc("OSMPublicTransport", 0, 17, 256, ".png", new String[]{"http://openptmap.org/tiles/"}, "© OpenStreetMap contributors");
        c = vbcVar3;
        d = vbcVar;
        e = new ga1("CloudMadeStandardTiles", 0, 18, 256, ".png", new String[]{"http://a.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://b.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://c.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s"});
        f = new ga1("CloudMadeSmallTiles", 0, 21, 64, ".png", new String[]{"http://a.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://b.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://c.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s"});
        g = new vbc("Fiets", 3, 18, 256, ".png", new String[]{"https://overlay.openstreetmap.nl/openfietskaart-overlay/"}, "© OpenStreetMap contributors");
        h = new vbc("BaseNL", 0, 18, 256, ".png", new String[]{"https://overlay.openstreetmap.nl/basemap/"});
        i = new vbc("RoadsNL", 0, 18, 256, ".png", new String[]{"https://overlay.openstreetmap.nl/roads/"}, "© OpenStreetMap contributors");
        vbc vbcVar4 = new vbc("HikeBikeMap", 0, 18, 256, ".png", new String[]{"https://tiles.wmflabs.org/hikebike/"});
        j = vbcVar4;
        k = new vbc("OpenSeaMap", 3, 18, 256, ".png", new String[]{"https://tiles.openseamap.org/seamark/"}, "OpenSeaMap");
        a aVar = new a("USGS National Map Topo", 0, 15, 256, "", new String[]{"https://basemap.nationalmap.gov/arcgis/rest/services/USGSTopo/MapServer/tile/"}, "USGS");
        l = aVar;
        b bVar = new b("USGS National Map Sat", 0, 15, 256, "", new String[]{"https://basemap.nationalmap.gov/arcgis/rest/services/USGSImageryTopo/MapServer/tile/"}, "USGS");
        m = bVar;
        vbc vbcVar5 = new vbc("ChartbundleWAC", 4, 12, 256, ".png?type=google", new String[]{"https://wms.chartbundle.com/tms/v1.0/wac/"}, "chartbundle.com");
        n = vbcVar5;
        vbc vbcVar6 = new vbc("ChartbundleENRH", 4, 12, 256, ".png?type=google", new String[]{"https://wms.chartbundle.com/tms/v1.0/enrh/", "chartbundle.com"});
        o = vbcVar6;
        vbc vbcVar7 = new vbc("ChartbundleENRL", 4, 12, 256, ".png?type=google", new String[]{"https://wms.chartbundle.com/tms/v1.0/enrl/", "chartbundle.com"});
        p = vbcVar7;
        vbc vbcVar8 = new vbc("OpenTopoMap", 0, 17, 256, ".png", new String[]{"https://a.tile.opentopomap.org/", "https://b.tile.opentopomap.org/", "https://c.tile.opentopomap.org/"}, "Kartendaten: © OpenStreetMap-Mitwirkende, SRTM | Kartendarstellung: © OpenTopoMap (CC-BY-SA)");
        q = vbcVar8;
        ArrayList arrayList = new ArrayList();
        r = arrayList;
        arrayList.add(vbcVar);
        r.add(vbcVar2);
        r.add(vbcVar3);
        r.add(vbcVar4);
        r.add(aVar);
        r.add(bVar);
        r.add(vbcVar5);
        r.add(vbcVar6);
        r.add(vbcVar7);
        r.add(vbcVar8);
    }

    public static org.osmdroid.tileprovider.tilesource.a a(String str) throws IllegalArgumentException {
        for (org.osmdroid.tileprovider.tilesource.a aVar : r) {
            if (aVar.name().equals(str)) {
                return aVar;
            }
        }
        throw new IllegalArgumentException("No such tile source: " + str);
    }

    public static List<org.osmdroid.tileprovider.tilesource.a> b() {
        return r;
    }
}
