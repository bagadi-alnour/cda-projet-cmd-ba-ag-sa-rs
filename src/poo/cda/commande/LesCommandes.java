package poo.cda.commande;



public  interface LesCommandes {
	//commentary
	public static final CommandeHelp HELP = new CommandeHelp();
	public static final CommandeRiver RIVER = new CommandeRiver();
	public static final CommandeIsPrime IS_PRIME = new CommandeIsPrime();
	public static final CommandeHistory HISTORY = new CommandeHistory();
	public static final CommandeHistClear HISTORY_CLEAR  = new CommandeHistClear();
	public static final CommandeQUIT QUITER  = new CommandeQUIT();
	public static final CommandeExit EXIT  = new CommandeExit();
	public static final CommandeDir DIR = new CommandeDir();
	public static final CommandeDirNG DIR_NOUVELLE_GENERATION = new CommandeDirNG();
	public static final CommandeCD CD = new CommandeCD();
	public static final CommandeFind FIND = new CommandeFind();
	public static final CommandeCat CAT = new CommandeCat();
	public static final CommandeCopy COPY = new CommandeCopy();
	public static final CommandeCRF CRF = new CommandeCRF();
	public static final CommandeCRD CRD = new CommandeCRD();
	public static final CommandeNow NOW = new CommandeNow();
	public static final CommandeCount COUNT = new CommandeCount();
	public static final CommandeGetVars GET_VARS = new CommandeGetVars();
	public static final CommandeGetFline GET_FLINE = new CommandeGetFline();

}
