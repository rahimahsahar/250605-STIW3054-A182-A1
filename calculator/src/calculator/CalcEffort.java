package calculator;
public class CalcEffort {
	

	public static double UUCP (double TAP, double TUC)
	{
		double uacp = TAP + TUC;
		return uacp;
	}
	
	public static double TCF (double Tfactor)
	{
		double cp = (0.01 * Tfactor)+0.6;
		return cp;
	}
	
	public static double SUC (double uacp, double cp)
	{
		double szuc = uacp * cp;
		return szuc;
	}
	
	public static double EF (double Efactor)
	{
		double e = (-0.03 * Efactor)+1.4;
		return e;
	}
	
	public static double UCP (double szuc, double e)
	{
		double usecase = szuc * e;
		return usecase;
	}
	
	public static double ManHour (double usecase)
	{
		double mh = 28 * usecase;
		return mh;
	}
	
	public static double AdjustManHour (double percent, double mh)
	{
		double p = percent / 100 ;
		double admh = (1.0 + p)*mh;
		return admh;
	}
	
	public static double TotalManHour (double amh, double rmh)
	{
		double tmh = amh + rmh;
		return tmh;
	}
	
	public static double Actor (double TAP)
	{
		double t = TAP;
		return t;
	}
	
	public static double UseCase (double TUC)
	{
		double u = TUC;
		return u;
	}

}

