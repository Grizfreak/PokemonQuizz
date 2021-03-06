package com.example.PokemonQuizz;

import java.util.stream.Stream;

/**
 * Enum used to store each pokemon name
 */
public enum PokemonNames {


    Bulbizarre("Bulbizarre"),
    Herbizarre("Herbizarre"),
    Florizarre("Florizarre"),
    Salamèche("Salamèche"),
    Reptincel("Reptincel"),
    Dracaufeu("Dracaufeu"),
    Carapuce("Carapuce"),
    Carabaffe("Carabaffe"),
    Tortank("Tortank"),
    Chenipan("Chenipan"),
    Chrysacier("Chrysacier"),
    Papilusion("Papilusion"),
    Aspicot("Aspicot"),
    Coconfort("Coconfort"),
    Dardargnan("Dardargnan"),
    Roucool("Roucool"),
    Roucoups("Roucoups"),
    Roucarnage("Roucarnage"),
    Rattata("Rattata"),
    Rattatac("Rattatac"),
    Piafabec("Piafabec"),
    Rapasdepic("Rapasdepic"),
    Abo("Abo"),
    Arbok("Arbok"),
    Pikachu("Pikachu"),
    Raichu("Raichu"),
    Sabelette("Sabelette"),
    Sablaireau("Sablaireau"),
    NidoranF("Nidoran Femelle"),
    Nidorina("Nidorina"),
    Nidoqueen("Nidoqueen"),
    NidoranM("Nidoran Mâle"),
    Nidorino("Nidorino"),
    Nidoking("Nidoking"),
    Mélofée("Mélofée"),
    Mélodelfe("Mélodelfe"),
    Goupix("Goupix"),
    Feunard("Feunard"),
    Rondoudou("Rondoudou"),
    Grodoudou("Grodoudou"),
    Nosferapti("Nosferapti"),
    Nosferalto("Nosferalto"),
    Mystherbe("Mystherbe"),
    Ortide("Ortide"),
    Rafflesia("Rafflesia"),
    Paras("Paras"),
    Parasect("Parasect"),
    Mimitoss("Mimitoss"),
    Aéromite("Aéromite"),
    Taupiqueur("Taupiqueur"),
    Triopikeur("Triopikeur"),
    Miaouss("Miaouss"),
    Persian("Persian"),
    Psykokwak("Psykokwak"),
    Akwakwak("Akwakwak"),
    Férosinge("Férosinge"),
    Colossinge("Colossinge"),
    Caninos("Caninos"),
    Arcanin("Arcanin"),
    Ptitard("Ptitard"),
    Têtarte("Têtarte"),
    Tartard("Tartard"),
    Abra("Abra"),
    Kadabra("Kadabra"),
    Alakazam("Alakazam"),
    Machoc("Machoc"),
    Machopeur("Machopeur"),
    Mackogneur("Mackogneur"),
    Chétiflor("Chétiflor"),
    Boustiflor("Boustiflor"),
    Empiflor("Empiflor"),
    Tentacool("Tentacool"),
    Tentacruel("Tentacruel"),
    Racaillou("Racaillou"),
    Gravalanch("Gravalanch"),
    Grolem("Grolem"),
    Ponyta("Ponyta"),
    Galopa("Galopa"),
    Ramoloss("Ramoloss"),
    Flagadoss("Flagadoss"),
    Magnéti("Magnéti"),
    Magnéton("Magnéton"),
    Canarticho("Canarticho"),
    Doduo("Doduo"),
    Dodrio("Dodrio"),
    Otaria("Otaria"),
    Lamantine("Lamantine"),
    Tadmorv("Tadmorv"),
    Grotadmorv("Grotadmorv"),
    Kokiyas("Kokiyas"),
    Crustabri("Crustabri"),
    Fantominus("Fantominus"),
    Spectrum("Spectrum"),
    Ectoplasma("Ectoplasma"),
    Onix("Onix"),
    Soporifik("Soporifik"),
    Hypnomade("Hypnomade"),
    Krabby("Krabby"),
    Krabboss("Krabboss"),
    Voltorbe("Voltorbe"),
    Électrode("Électrode"),
    Noeunoeuf("Noeunoeuf"),
    Noadkoko("Noadkoko"),
    Osselait("Osselait"),
    Ossatueur("Ossatueur"),
    Kicklee("Kicklee"),
    Tygnon("Tygnon"),
    Excelangue("Excelangue"),
    Smogo("Smogo"),
    Smogogo("Smogogo"),
    Rhinocorne("Rhinocorne"),
    Rhinoféros("Rhinoféros"),
    Leveinard("Leveinard"),
    Saquedeneu("Saquedeneu"),
    Kangourex("Kangourex"),
    Hypotrempe("Hypotrempe"),
    Hypocéan("Hypocéan"),
    Poissirène("Poissirène"),
    Poissoroy("Poissoroy"),
    Stari("Stari"),
    Staross("Staross"),
    M_mime("M. mime"),
    Insécateur("Insécateur"),
    Lippoutou("Lippoutou"),
    Élektek("Élektek"),
    Magmar("Magmar"),
    Scarabrute("Scarabrute"),
    Tauros("Tauros"),
    Magicarpe("Magicarpe"),
    Léviator("Léviator"),
    Lokhlass("Lokhlass"),
    Métamorph("Métamorph"),
    Évoli("Évoli"),
    Aquali("Aquali"),
    Voltali("Voltali"),
    Pyroli("Pyroli"),
    Porygon("Porygon"),
    Amonita("Amonita"),
    Amonistar("Amonistar"),
    Kabuto("Kabuto"),
    Kabutops("Kabutops"),
    Ptéra("Ptéra"),
    Ronflex("Ronflex"),
    Artikodin("Artikodin"),
    Électhor("Électhor"),
    Sulfura("Sulfura"),
    Minidraco("Minidraco"),
    Draco("Draco"),
    Dracolosse("Dracolosse"),
    Mewtwo("Mewtwo"),
    Mew("Mew"),
    Germignon("Germignon"),
    Macronium("Macronium"),
    Méganium("Méganium"),
    Héricendre("Héricendre"),
    Feurisson("Feurisson"),
    Typhlosion("Typhlosion"),
    Kaiminus("Kaiminus"),
    Crocrodil("Crocrodil"),
    Aligatueur("Aligatueur"),
    Fouinette("Fouinette"),
    Fouinar("Fouinar"),
    Hoothoot("Hoothoot"),
    Noarfang("Noarfang"),
    Coxy("Coxy"),
    Coxyclaque("Coxyclaque"),
    Mimigal("Mimigal"),
    Migalos("Migalos"),
    Nostenfer("Nostenfer"),
    Loupio("Loupio"),
    Lanturn("Lanturn"),
    Pichu("Pichu"),
    Mélo("Mélo"),
    Toudoudou("Toudoudou"),
    Togepi("Togepi"),
    Togetic("Togetic"),
    Natu("Natu"),
    Xatu("Xatu"),
    Wattouat("Wattouat"),
    Lainergie("Lainergie"),
    Pharamp("Pharamp"),
    Joliflor("Joliflor"),
    Marill("Marill"),
    Azumarill("Azumarill"),
    Simularbre("Simularbre"),
    Tarpaud("Tarpaud"),
    Granivol("Granivol"),
    Floravol("Floravol"),
    Cotovol("Cotovol"),
    Capumain("Capumain"),
    Tournegrin("Tournegrin"),
    Héliatronc("Héliatronc"),
    Yanma("Yanma"),
    Axoloto("Axoloto"),
    Maraiste("Maraiste"),
    Mentali("Mentali"),
    Noctali("Noctali"),
    Cornèbre("Cornèbre"),
    Roigada("Roigada"),
    Feuforêve("Feuforêve"),
    Zarbi("Zarbi"),
    Qulbutoké("Qulbutoké"),
    Girafarig("Girafarig"),
    Pomdepik("Pomdepik"),
    Foretress("Foretress"),
    Insolourdo("Insolourdo"),
    Scorplane("Scorplane"),
    Steelix("Steelix"),
    Snubbull("Snubbull"),
    Granbull("Granbull"),
    Qwilfish("Qwilfish"),
    Cizayox("Cizayox"),
    Caratroc("Caratroc"),
    Scarhino("Scarhino"),
    Farfuret("Farfuret"),
    Teddiursa("Teddiursa"),
    Ursaring("Ursaring"),
    Limagma("Limagma"),
    Volcaropod("Volcaropod"),
    Marcacrin("Marcacrin"),
    Cochignon("Cochignon"),
    Corayon("Corayon"),
    Rémoraid("Rémoraid"),
    Octillery("Octillery"),
    Cadoizo("Cadoizo"),
    Démanta("Démanta"),
    Airmure("Airmure"),
    Malosse("Malosse"),
    Démolosse("Démolosse"),
    Hyporoi("Hyporoi"),
    Phanpy("Phanpy"),
    Donphan("Donphan"),
    Porygon2("Porygon2"),
    Cerfrousse("Cerfrousse"),
    Queulorior("Queulorior"),
    Debugant("Debugant"),
    Kapoera("Kapoera"),
    Lippouti("Lippouti"),
    Élekid("Élekid"),
    Magby("Magby"),
    Écrémeuh("Écrémeuh"),
    Leuphorie("Leuphorie"),
    Raikou("Raikou"),
    Entei("Entei"),
    Suicune("Suicune"),
    Embrylex("Embrylex"),
    Ymphect("Ymphect"),
    Tyranocif("Tyranocif"),
    Lugia("Lugia"),
    Ho_oh("Ho-oh"),
    Celebi("Celebi"),
    Arcko("Arcko"),
    Massko("Massko"),
    Jungko("Jungko"),
    Poussifeu("Poussifeu"),
    Galifeu("Galifeu"),
    Braségali("Braségali"),
    Gobou("Gobou"),
    Flobio("Flobio"),
    Laggron("Laggron"),
    Medhyèna("Medhyèna"),
    Grahyèna("Grahyèna"),
    Zigzaton("Zigzaton"),
    Linéon("Linéon"),
    Chenipotte("Chenipotte"),
    Armulys("Armulys"),
    Charmillon("Charmillon"),
    Blindalys("Blindalys"),
    Papinox("Papinox"),
    Nénupiot("Nénupiot"),
    Lombre("Lombre"),
    Ludicolo("Ludicolo"),
    Grainipiot("Grainipiot"),
    Pifeuil("Pifeuil"),
    Tengalice("Tengalice"),
    Nirondelle("Nirondelle"),
    Hélédelle("Hélédelle"),
    Goélise("Goélise"),
    Bekipan("Bekipan"),
    Tarsal("Tarsal"),
    Kirlia("Kirlia"),
    Gardevoir("Gardevoir"),
    Arakdo("Arakdo"),
    Maskadra("Maskadra"),
    Balignon("Balignon"),
    Chapignon("Chapignon"),
    Parecool("Parecool"),
    Vigoroth("Vigoroth"),
    Monaflèmit("Monaflèmit"),
    Ningale("Ningale"),
    Ninjask("Ninjask"),
    Munja("Munja"),
    Chuchmur("Chuchmur"),
    Ramboum("Ramboum"),
    Brouhabam("Brouhabam"),
    Makuhita("Makuhita"),
    Hariyama("Hariyama"),
    Azurill("Azurill"),
    Tarinor("Tarinor"),
    Skitty("Skitty"),
    Delcatty("Delcatty"),
    Ténéfix("Ténéfix"),
    Mysdibule("Mysdibule"),
    Galekid("Galekid"),
    Galegon("Galegon"),
    Galeking("Galeking"),
    Méditikka("Méditikka"),
    Charmina("Charmina"),
    Dynavolt("Dynavolt"),
    Élecsprint("Élecsprint"),
    Posipi("Posipi"),
    Négapi("Négapi"),
    Muciole("Muciole"),
    Lumivole("Lumivole"),
    Rosélia("Rosélia"),
    Gloupti("Gloupti"),
    Avaltout("Avaltout"),
    Carvanha("Carvanha"),
    Sharpedo("Sharpedo"),
    Wailmer("Wailmer"),
    Wailord("Wailord"),
    Chamallot("Chamallot"),
    Camérupt("Camérupt"),
    Chartor("Chartor"),
    Spoink("Spoink"),
    Groret("Groret"),
    Spinda("Spinda"),
    Kraknoix("Kraknoix"),
    Vibraninf("Vibraninf"),
    Libégon("Libégon"),
    Cacnea("Cacnea"),
    Cacturne("Cacturne"),
    Tylton("Tylton"),
    Altaria("Altaria"),
    Mangriff("Mangriff"),
    Séviper("Séviper"),
    Séléroc("Séléroc"),
    Solaroc("Solaroc"),
    Barloche("Barloche"),
    Barbicha("Barbicha"),
    Écrapince("Écrapince"),
    Colhomard("Colhomard"),
    Balbuto("Balbuto"),
    Kaorine("Kaorine"),
    Lilia("Lilia"),
    Vacilys("Vacilys"),
    Anorith("Anorith"),
    Armaldo("Armaldo"),
    Barpau("Barpau"),
    Milobellus("Milobellus"),
    Morphéo("Morphéo"),
    Kecleon("Kecleon"),
    Polichombr("Polichombr"),
    Branette("Branette"),
    Skelénox("Skelénox"),
    Téraclope("Téraclope"),
    Tropius("Tropius"),
    Éoko("Éoko"),
    Absol("Absol"),
    Okéoké("Okéoké"),
    Stalgamin("Stalgamin"),
    Oniglali("Oniglali"),
    Obalie("Obalie"),
    Phogleur("Phogleur"),
    Kaimorse("Kaimorse"),
    Coquiperl("Coquiperl"),
    Serpang("Serpang"),
    Rosabyss("Rosabyss"),
    Relicanth("Relicanth"),
    Lovdisc("Lovdisc"),
    Draby("Draby"),
    Drackhaus("Drackhaus"),
    Drattak("Drattak"),
    Terhal("Terhal"),
    Métang("Métang"),
    Métalosse("Métalosse"),
    Regirock("Regirock"),
    Regice("Regice"),
    Registeel("Registeel"),
    Latias("Latias"),
    Latios("Latios"),
    Kyogre("Kyogre"),
    Groudon("Groudon"),
    Rayquaza("Rayquaza"),
    Jirachi("Jirachi"),
    Deoxys("Deoxys"),
    Tortipouss("Tortipouss"),
    Boskara("Boskara"),
    Torterra("Torterra"),
    Ouisticram("Ouisticram"),
    Chimpenfeu("Chimpenfeu"),
    Simiabraz("Simiabraz"),
    Tiplouf("Tiplouf"),
    Prinplouf("Prinplouf"),
    Pingoléon("Pingoléon"),
    Étourmi("Étourmi"),
    Étourvol("Étourvol"),
    Étouraptor("Étouraptor"),
    Keunotor("Keunotor"),
    Castorno("Castorno"),
    Crikzik("Crikzik"),
    Mélokrik("Mélokrik"),
    Lixy("Lixy"),
    Luxio("Luxio"),
    Luxray("Luxray"),
    Rozbouton("Rozbouton"),
    Roserade("Roserade"),
    Kranidos("Kranidos"),
    Charkos("Charkos"),
    Dinoclier("Dinoclier"),
    Bastiodon("Bastiodon"),
    Cheniti("Cheniti"),
    Cheniselle("Cheniselle"),
    Papilord("Papilord"),
    Apitrini("Apitrini"),
    Apireine("Apireine"),
    Pachirisu("Pachirisu"),
    Mustébouée("Mustébouée"),
    Mustéflott("Mustéflott"),
    Ceribou("Ceribou"),
    Ceriflor("Ceriflor"),
    Sancoki("Sancoki"),
    Tritosor("Tritosor"),
    Capidextre("Capidextre"),
    Baudrive("Baudrive"),
    Grodrive("Grodrive"),
    Laporeille("Laporeille"),
    Lockpin("Lockpin"),
    Magirêve("Magirêve"),
    Corboss("Corboss"),
    Chaglam("Chaglam"),
    Chaffreux("Chaffreux"),
    Korillon("Korillon"),
    Moufouette("Moufouette"),
    Moufflair("Moufflair"),
    Archéomire("Archéomire"),
    Archéodong("Archéodong"),
    Manzaï("Manzaï"),
    Mime_jr("Mime jr"),
    Ptiravi("Ptiravi"),
    Pijako("Pijako"),
    Spiritomb("Spiritomb"),
    Griknot("Griknot"),
    Carmache("Carmache"),
    Carchacrok("Carchacrok"),
    Goinfrex("Goinfrex"),
    Riolu("Riolu"),
    Lucario("Lucario"),
    Hippopotas("Hippopotas"),
    Hippodocus("Hippodocus"),
    Rapion("Rapion"),
    Drascore("Drascore"),
    Cradopaud("Cradopaud"),
    Coatox("Coatox"),
    Vortente("Vortente"),
    Écayon("Écayon"),
    Luminéon("Luminéon"),
    Babimanta("Babimanta"),
    Blizzi("Blizzi"),
    Blizzaroi("Blizzaroi"),
    Dimoret("Dimoret"),
    Magnézone("Magnézone"),
    Coudlangue("Coudlangue"),
    Rhinastoc("Rhinastoc"),
    Bouldeneu("Bouldeneu"),
    Élekable("Élekable"),
    Maganon("Maganon"),
    Togekiss("Togekiss"),
    Yanméga("Yanméga"),
    Phyllali("Phyllali"),
    Givrali("Givrali"),
    Scorvol("Scorvol"),
    Mammochon("Mammochon"),
    Porygon_z("Porygon-z"),
    Gallame("Gallame"),
    Tarinorme("Tarinorme"),
    Noctunoir("Noctunoir"),
    Momartik("Momartik"),
    Motisma("Motisma"),
    Créhelf("Créhelf"),
    Créfollet("Créfollet"),
    Créfadet("Créfadet"),
    Dialga("Dialga"),
    Palkia("Palkia"),
    Heatran("Heatran"),
    Regigigas("Regigigas"),
    Giratina("Giratina"),
    Cresselia("Cresselia"),
    Phione("Phione"),
    Manaphy("Manaphy"),
    Darkrai("Darkrai"),
    Shaymin("Shaymin"),
    Arceus("Arceus"),
    Victini("Victini"),
    Vipélierre("Vipélierre"),
    Lianaja("Lianaja"),
    Majaspic("Majaspic"),
    Gruikui("Gruikui"),
    Grotichon("Grotichon"),
    Roitiflam("Roitiflam"),
    Moustillon("Moustillon"),
    Mateloutre("Mateloutre"),
    Clamiral("Clamiral"),
    Ratentif("Ratentif"),
    Miradar("Miradar"),
    Ponchiot("Ponchiot"),
    Ponchien("Ponchien"),
    Mastouffe("Mastouffe"),
    Chacripan("Chacripan"),
    Léopardus("Léopardus"),
    Feuillajou("Feuillajou"),
    Feuilloutan("Feuilloutan"),
    Flamajou("Flamajou"),
    Flamoutan("Flamoutan"),
    Flotajou("Flotajou"),
    Flotoutan("Flotoutan"),
    Munna("Munna"),
    Mushana("Mushana"),
    Poichigeon("Poichigeon"),
    Colombeau("Colombeau"),
    Déflaisan("Déflaisan"),
    Zébibron("Zébibron"),
    Zéblitz("Zéblitz"),
    Nodulithe("Nodulithe"),
    Géolithe("Géolithe"),
    Gigalithe("Gigalithe"),
    Chovsourir("Chovsourir"),
    Rhinolove("Rhinolove"),
    Rototaupe("Rototaupe"),
    Minotaupe("Minotaupe"),
    Nanméouïe("Nanméouïe"),
    Charpenti("Charpenti"),
    Ouvrifier("Ouvrifier"),
    Bétochef("Bétochef"),
    Tritonde("Tritonde"),
    Batracné("Batracné"),
    Crapustule("Crapustule"),
    Judokrak("Judokrak"),
    Karaclée("Karaclée"),
    Larveyette("Larveyette"),
    Couverdure("Couverdure"),
    Manternel("Manternel"),
    Venipatte("Venipatte"),
    Scobolide("Scobolide"),
    Brutapode("Brutapode"),
    Doudouvet("Doudouvet"),
    Farfaduvet("Farfaduvet"),
    Chlorobule("Chlorobule"),
    Fragilady("Fragilady"),
    Bargantua("Bargantua"),
    Mascaïman("Mascaïman"),
    Escroco("Escroco"),
    Crocorible("Crocorible"),
    Darumarond("Darumarond"),
    Darumacho("Darumacho"),
    Maracachi("Maracachi"),
    Crabicoque("Crabicoque"),
    Crabaraque("Crabaraque"),
    Baggiguane("Baggiguane"),
    Baggaïd("Baggaïd"),
    Cryptéro("Cryptéro"),
    Tutafeh("Tutafeh"),
    Tutankafer("Tutankafer"),
    Carapagos("Carapagos"),
    Mégapagos("Mégapagos"),
    Arkéapti("Arkéapti"),
    Aéroptéryx("Aéroptéryx"),
    Miamiasme("Miamiasme"),
    Miasmax("Miasmax"),
    Zorua("Zorua"),
    Zoroark("Zoroark"),
    Chinchidou("Chinchidou"),
    Pashmilla("Pashmilla"),
    Scrutella("Scrutella"),
    Mesmérella("Mesmérella"),
    Sidérella("Sidérella"),
    Nucléos("Nucléos"),
    Méios("Méios"),
    Symbios("Symbios"),
    Couaneton("Couaneton"),
    Lakmécygne("Lakmécygne"),
    Sorbébé("Sorbébé"),
    Sorboul("Sorboul"),
    Sorbouboul("Sorbouboul"),
    Vivaldaim("Vivaldaim"),
    Haydaim("Haydaim"),
    Emolga("Emolga"),
    Carabing("Carabing"),
    Lançargot("Lançargot"),
    Trompignon("Trompignon"),
    Gaulet("Gaulet"),
    Viskuse("Viskuse"),
    Moyade("Moyade"),
    Mamanbo("Mamanbo"),
    Statitik("Statitik"),
    Mygavolt("Mygavolt"),
    Grindur("Grindur"),
    Noacier("Noacier"),
    Tic("Tic"),
    Clic("Clic"),
    Cliticlic("Cliticlic"),
    Anchwatt("Anchwatt"),
    Lampéroie("Lampéroie"),
    Ohmassacre("Ohmassacre"),
    Lewsor("Lewsor"),
    Neitram("Neitram"),
    Funécire("Funécire"),
    Mélancolux("Mélancolux"),
    Lugulabre("Lugulabre"),
    Coupenotte("Coupenotte"),
    Incisache("Incisache"),
    Tranchodon("Tranchodon"),
    Polarhume("Polarhume"),
    Polagriffe("Polagriffe"),
    Hexagel("Hexagel"),
    Escargaume("Escargaume"),
    Limaspeed("Limaspeed"),
    Limonde("Limonde"),
    Kungfouine("Kungfouine"),
    Shaofouine("Shaofouine"),
    Drakkarmin("Drakkarmin"),
    Gringolem("Gringolem"),
    Golemastoc("Golemastoc"),
    Scalpion("Scalpion"),
    Scalproie("Scalproie"),
    Frison("Frison"),
    Furaiglon("Furaiglon"),
    Gueriaigle("Gueriaigle"),
    Vostourno("Vostourno"),
    Vaututrice("Vaututrice"),
    Aflamanoir("Aflamanoir"),
    Fermite("Fermite"),
    Solochi("Solochi"),
    Diamat("Diamat"),
    Trioxhydre("Trioxhydre"),
    Pyronille("Pyronille"),
    Pyrax("Pyrax"),
    Cobaltium("Cobaltium"),
    Terrakium("Terrakium"),
    Viridium("Viridium"),
    Boréas("Boréas"),
    Fulguris("Fulguris"),
    Reshiram("Reshiram"),
    Zekrom("Zekrom"),
    Démétéros("Démétéros"),
    Kyurem("Kyurem"),
    Keldeo("Keldeo"),
    Meloetta("Meloetta"),
    Genesect("Genesect"),
    Marisson("Marisson"),
    Boguérisse("Boguérisse"),
    Blindépique("Blindépique"),
    Feunnec("Feunnec"),
    Roussil("Roussil"),
    Goupelin("Goupelin"),
    Grenousse("Grenousse"),
    Croâporal("Croâporal"),
    Amphinobi("Amphinobi"),
    Sapereau("Sapereau"),
    Excavarenne("Excavarenne"),
    Passerouge("Passerouge"),
    Braisillon("Braisillon"),
    Flambusard("Flambusard"),
    Lépidonille("Lépidonille"),
    Pérégrain("Pérégrain"),
    Prismillon("Prismillon"),
    Hélionceau("Hélionceau"),
    Némélios("Némélios"),
    Flabébé("Flabébé"),
    Floette("Floette"),
    Florges("Florges"),
    Cabriolaine("Cabriolaine"),
    Chevroum("Chevroum"),
    Pandespiègle("Pandespiègle"),
    Pandarbare("Pandarbare"),
    Couafarel("Couafarel"),
    Psystigri("Psystigri"),
    Mistigrix("Mistigrix"),
    Monorpale("Monorpale"),
    Dimoclès("Dimoclès"),
    Exagide("Exagide"),
    Fluvetin("Fluvetin"),
    Cocotine("Cocotine"),
    Sucroquin("Sucroquin"),
    Cupcanaille("Cupcanaille"),
    Sepiatop("Sepiatop"),
    Sepiatroce("Sepiatroce"),
    Opermine("Opermine"),
    Golgopathe("Golgopathe"),
    Venalgue("Venalgue"),
    Kravarech("Kravarech"),
    Flingouste("Flingouste"),
    Gamblast("Gamblast"),
    Galvaran("Galvaran"),
    Iguolta("Iguolta"),
    Ptyranidur("Ptyranidur"),
    Rexillius("Rexillius"),
    Amagara("Amagara"),
    Dragmara("Dragmara"),
    Nymphali("Nymphali"),
    Brutalibré("Brutalibré"),
    Dedenne("Dedenne"),
    Strassie("Strassie"),
    Mucuscule("Mucuscule"),
    Colimucus("Colimucus"),
    Muplodocus("Muplodocus"),
    Trousselin("Trousselin"),
    Brocélôme("Brocélôme"),
    Desséliande("Desséliande"),
    Pitrouille("Pitrouille"),
    Banshitrouye("Banshitrouye"),
    Grelaçon("Grelaçon"),
    Séracrawl("Séracrawl"),
    Sonistrelle("Sonistrelle"),
    Bruyverne("Bruyverne"),
    Xerneas("Xerneas"),
    Yveltal("Yveltal"),
    Zygarde("Zygarde"),
    Diancie("Diancie"),
    Hoopa("Hoopa"),
    Volcanion("Volcanion"),
    Brindibou("Brindibou"),
    Efflèche("Efflèche"),
    Archéduc("Archéduc"),
    Flamiaou("Flamiaou"),
    Matoufeu("Matoufeu"),
    Félinferno("Félinferno"),
    Otaquin("Otaquin"),
    Otarlette("Otarlette"),
    Oratoria("Oratoria"),
    Picassaut("Picassaut"),
    Piclairon("Piclairon"),
    Bazoucan("Bazoucan"),
    Manglouton("Manglouton"),
    Argouste("Argouste"),
    Larvibule("Larvibule"),
    Chrysapile("Chrysapile"),
    Lucanon("Lucanon"),
    Crabagarre("Crabagarre"),
    Crabominable("Crabominable"),
    Plumeline("Plumeline"),
    Bombydou("Bombydou"),
    Rubombelle("Rubombelle"),
    Rocabot("Rocabot"),
    Lougaroc("Lougaroc"),
    Froussardine("Froussardine"),
    Vorastérie("Vorastérie"),
    Prédastérie("Prédastérie"),
    Tiboudet("Tiboudet"),
    Bourrinos("Bourrinos"),
    Araqua("Araqua"),
    Tarenbulle("Tarenbulle"),
    Mimantis("Mimantis"),
    Floramantis("Floramantis"),
    Spododo("Spododo"),
    Lampignon("Lampignon"),
    Tritox("Tritox"),
    Malamandre("Malamandre"),
    Nounourson("Nounourson"),
    Chelours("Chelours"),
    Croquine("Croquine"),
    Candine("Candine"),
    Sucreine("Sucreine"),
    Guérilande("Guérilande"),
    Gouroutan("Gouroutan"),
    Quartermac("Quartermac"),
    Sovkipou("Sovkipou"),
    Sarmuraï("Sarmuraï"),
    Bacabouh("Bacabouh"),
    Trépassable("Trépassable"),
    Concombaffe("Concombaffe"),
    Type_0("Type:0"),
    Silvallié("Silvallié"),
    Météno("Météno"),
    Dodoala("Dodoala"),
    Boumata("Boumata"),
    Togedemaru("Togedemaru"),
    Mimiqui("Mimiqui"),
    Denticrisse("Denticrisse"),
    Draïeul("Draïeul"),
    Sinistrail("Sinistrail"),
    Bébécaille("Bébécaille"),
    Écaïd("Écaïd"),
    Ékaïser("Ékaïser"),
    Tokorico("Tokorico"),
    Tokopiyon("Tokopiyon"),
    Tokotoro("Tokotoro"),
    Tokopisco("Tokopisco"),
    Cosmog("Cosmog"),
    Cosmovum("Cosmovum"),
    Solgaleo("Solgaleo"),
    Lunala("Lunala"),
    Zéroïd("Zéroïd"),
    Mouscoto("Mouscoto"),
    Cancrelove("Cancrelove"),
    Câblifère("Câblifère"),
    Bamboiselle("Bamboiselle"),
    Katagami("Katagami"),
    Engloutyran("Engloutyran"),
    Necrozma("Necrozma"),
    Magearna("Magearna"),
    Marshadow("Marshadow"),
    Vémini("Vémini"),
    Mandrillon("Mandrillon"),
    Ama_ama("Ama-ama"),
    Pierroteknik("Pierroteknik"),
    Zeraora("Zeraora"),
    Meltan("Meltan"),
    Melmetal("Melmetal"),
    Ouistempo("Ouistempo"),
    Badabouin("Badabouin"),
    Gorythmic("Gorythmic"),
    Flambino("Flambino"),
    Lapyro("Lapyro"),
    Pyrobut("Pyrobut"),
    Larméléon("Larméléon"),
    Arrozard("Arrozard"),
    Lézargus("Lézargus"),
    Rongourmand("Rongourmand"),
    Rongrigou("Rongrigou"),
    Minisange("Minisange"),
    Bleuseille("Bleuseille"),
    Corvaillus("Corvaillus"),
    Larvadar("Larvadar"),
    Coléodôme("Coléodôme"),
    Astronelle("Astronelle"),
    Goupilou("Goupilou"),
    Roublenard("Roublenard"),
    Tournicoton("Tournicoton"),
    Blancoton("Blancoton"),
    Moumouton("Moumouton"),
    Moumouflon("Moumouflon"),
    Khélocrok("Khélocrok"),
    Torgamord("Torgamord"),
    Voltoutou("Voltoutou"),
    Fulgudog("Fulgudog"),
    Charbi("Charbi"),
    Wagomine("Wagomine"),
    Monthracite("Monthracite"),
    Verpom("Verpom"),
    Pomdrapi("Pomdrapi"),
    Dratatin("Dratatin"),
    Dunaja("Dunaja"),
    Dunaconda("Dunaconda"),
    Nigosier("Nigosier"),
    Embrochet("Embrochet"),
    Hastacuda("Hastacuda"),
    Toxizap("Toxizap"),
    Salarsen("Salarsen"),
    Grillepattes("Grillepattes"),
    Scolocendre("Scolocendre"),
    Poulpaf("Poulpaf"),
    Krakos("Krakos"),
    Théffroi("Théffroi"),
    Polthégeist("Polthégeist"),
    Bibichut("Bibichut"),
    Chapotus("Chapotus"),
    Sorcilence("Sorcilence"),
    Grimalin("Grimalin"),
    Fourbelin("Fourbelin"),
    Angoliath("Angoliath"),
    Ixon("Ixon"),
    Berserkatt("Berserkatt"),
    Corayôme("Corayôme"),
    Palarticho("Palarticho"),
    M_glaquette("M. glaquette"),
    Tutétékri("Tutétékri"),
    Crèmy("Crèmy"),
    Charmilly("Charmilly"),
    Hexadron("Hexadron"),
    Wattapik("Wattapik"),
    Frissonille("Frissonille"),
    Beldeneige("Beldeneige"),
    Dolman("Dolman"),
    Bekaglaçon("Bekaglaçon"),
    Wimessir("Wimessir"),
    Morpeko("Morpeko"),
    Charibari("Charibari"),
    Pachyradjah("Pachyradjah"),
    Galvagon("Galvagon"),
    Galvagla("Galvagla"),
    Hydragon("Hydragon"),
    Hydragla("Hydragla"),
    Duralugon("Duralugon"),
    Fantyrm("Fantyrm"),
    Dispareptil("Dispareptil"),
    Lanssorien("Lanssorien"),
    Zacian("Zacian"),
    Zamazenta("Zamazenta"),
    Éthernatos("Éthernatos"),
    Wushours("Wushours"),
    Shifours("Shifours"),
    Zarude("Zarude"),
    Regieleki("Regieleki"),
    Regidrago("Regidrago"),
    Blizzeval("Blizzeval"),
    Spectreval("Spectreval"),
    Sylveroy("Sylveroy");

    private final String label;

    PokemonNames(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return this.label;
    }

    public static Stream<PokemonNames> stream() {
        return Stream.of(PokemonNames.values());
    }
}
