package universe.enums;

/**
 * <h1>Skupenství hmoty</h1>
 * Možno používat jenom pro tři základní, ale je jich zde specifikováno patnáct.
 * @author Jakub Štych
 * @version 13.5.2023
 */
public enum StateOfMatter {

    /**
     * <h3>Pevné skupenství</h3>
     * Základní částice jsou vůči sobě relativně blízko.
     * Síly mezi těmito částicemi jsou natolik silné, že se nemohou volně pohybovat.
     * Mohou pouze vibrovat.
     * Pevná látka má stabilní a definitivní tvar.
     * Mohou měnit svůj tvar pouze vnějšími silami, například zlomením, ulomením nebo roztříštěním.
     * Pokud jsou zahřáty na bod jejich varu, stávají se kapalnými.
     */
    SOLID,

    /**
     * <h3>Kapalné skupenství</h3>
     * Téměř neslačitelné kapaliny.
     * Přizpůsobují svůj tvar svému kontejneru, ale nenaplní ho celý.
     * Při konstantní teplotě a tlaku si uchovávají stabilní objem.
     * Objem látky v kapalném skupenství je vždy větší než objem stejné látky v pevném skupenství.
     */
    LIQUID,

    /**
     * <h3>Plynné skupenství</h3>
     * Plynné látky jsou stlačitelnými kapalinami.
     * Přizpůsobují svůj tvar svému kontejneru a roztáhnou se aby jej zcela naplinily.
     * Molekuly mají dostatek kinetické energie, že se skoro nikdy dva atomy nesetkají.
     * Vzdálenost mezi atomy je větší, než je velikost samotných atomů.
     * Plyny nemají definitivní tvar nebo hustotu.
     */
    GAS,

    /**
     * <h3>Plazmové skupenství</h3>
     * Stejně jako plynné látky, nemají plazmové látky ani definitivní tvar, ani definitivní hustotu.
     * Oproti plynnům je plazma elektricky vodivá.
     * Plazmové látky produkují magnetická pole s elektrickými proudy.
     * Silně reagují na elektromagnetické síly.
     * Plyn se stává plazmou kvůli vysokému napětí nebo vysoké teplotě.
     */
    PLASMA,

    /**
     * <h3>Částečně ionizovaná plazma</h3>
     * Kvůli vysokým teplotám se mnoho elektronů uvolnilo.
     * Ale některé z nich jsou stále součástí molekul.
     */
    PARTIALLY_IONIZED_PLAZMA,

    /**
     * <h3>Plně ionizovaná plazma</h3>
     * Při mimořádně velkých teplotách se všechny elektrony uvolnily.
     * Takové situace nastávají zejména ve hvězdách.
     */
    FULLY_IONIZED_PLAZMA,

    /**
     * <h3>Supertekutiny</h3>
     * Kapaliny, jejichž teplota je blízká absolutní nule
     * Nemají viskozitu a mohou tak přelézat okraje vlastního kontejneru.
     */
    SUPERFLUIDS,

    /**
     * <h3>Boseho–Einsteinův kondenzát</h3>
     * Studenější než jiné pevné látky.
     * Tvořené bosony.
     * Atomy zde mají velmi podoblé kvantové úrovně.
     * Teploty se pohybují blízko absolutní nule.
     * Jsou to kandidáti na temnou hmotu.
     */
    BOSE_EINSTEIN_CONDENSATE,

    /**
     * <h3>FERMIONIC_CONDENSATES</h3>
     * Podobné {@link #BOSE_EINSTEIN_CONDENSATE Boseho–Einsteinův kondenzát}.
     * Složené z fermoidů, což jsou částice kde se roztáčí pouze liché půlky.
     */
    FERMIONIC_CONDENSATES,

    /**
     * <h3>Rydbergovy molekuly</h3>
     * Metastabilní plazma.
     * Atomy se za vysoké teploty mohou přeměnit v ionty a elektrony.
     */
    RYDBERG_MOLECULES,

    /**
     * <h3>Kvantový hallův stav</h3>
     * Kvantový hallův stav dává vzniknout kvantovanému hallovému napětí měřenému v kolmém směru.
     */
    QUANTUM_HALL_STATE,

    /**
     * <h3>Fotonová hmota</h3>
     * Fenomén, kdy fotony reagující s plynem vytvoří kus hmoty.
     * Mohou reagovat s ostatními a dokonce i tvořit fotonové molekuly.
     */
    PHOTONIC_MATTER,

    /**
     * <h3>Kvantová kapka</h3>
     * Kvantová mlha elektronů.
     * Kvazičástice obsahující sbíru elektronů a děr vlnících se jako kapalina.
     * Díra = pozice, kde by se měl nacházet eletron, ale schází zde.
     */
    DROPLETON,

    /**
     * <h3>Stav vysoké energie</h3>
     * Degenerovaný plyn, kvarková hmota a kondenzát barevného skla (v jádrech atomů)
     */
    HIGH_ENERGY_STATE,

    /**
     * <h3>Stav velmi vysoké energie</h3>
     * Antihmota, Hagedronova teplota (superstruna)
     * Zejména po Velkém Třesku.
     */
    VERY_HIGH_ENERGY_STATE

}
