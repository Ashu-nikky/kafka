package org.sabre
import java.lang.Integer
import java.text.SimpleDateFormat

object odlogiccall {
  def main(args: Array[String]): Unit = {
    
     //val loadData = new LoadData()
     var mapAirsellOD = new java.util.TreeMap[Integer, ODClass]
     //mapAirsellOD=LoadData.loadData1()
    var formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm");
    var startServiceDate1 = formatter.parse("9/20/2016 09:20");
                              var endServiceDate1 = formatter.parse("9/20/2016 12:10");
                              var startServiceDate2 = formatter.parse("9/21/2016 14:10");
                              var endServiceDate2 = formatter.parse("9/21/2016 16:40");
                              var startServiceDate3 = formatter.parse("9/21/2016 14:10");
                              var endServiceDate3 = formatter.parse("9/21/2016 16:40");
                              var startServiceDate4 = formatter.parse("9/21/2016 14:10");
                              var endServiceDate4 = formatter.parse("9/21/2016 16:40");

             var startServiceDateTime1 = formatter.parse("3/1/2010 21:35");
             var startServiceTime1 = "21:35";
             var endServiceDateTime1 = formatter.parse("3/2/2010 15:40");
             var endServiceTime1 = "15:40";
             
             var startServiceDateTime2 = formatter.parse("3/2/2010 18:00");
             var startServiceTime2 = "18:00";
             var endServiceDateTime2 = formatter.parse("3/2/2010 19:10");
             var endServiceTime2 = "19:10";
             
             var startServiceDateTime3 = formatter.parse("3/8/2010 20:00");
             var startServiceTime3 = "20:00";
             var endServiceDateTime3 = formatter.parse("3/8/2010 21:10");
             var endServiceTime3 = "21:10";
             
             var startServiceDateTime4 = formatter.parse("3/9/2010 0:10");
             var startServiceTime4 = "0:10";
             var endServiceDateTime4 = formatter.parse("3/9/2010 5:55");
             var endServiceTime4 = "5:55";
 
            mapAirsellOD.put(1,new ODClass("TLBAST", 1, "LHR", startServiceDateTime1,
                           startServiceDate1,startServiceTime1,
                           "BKK", endServiceDateTime1,endServiceDate1,endServiceTime1,
                           "BA", "GB", "TH",
                           1079.7107, null, null, null, null,
                           null, null, null, null,
                           null, null, null, null));

            mapAirsellOD.put(1, new ODClass("TLBAST", 1, "LHR", startServiceDateTime1,
                           startServiceDate1,startServiceTime1,
                           "BKK", endServiceDateTime1,endServiceDate1,endServiceTime1,
                           "BA", "GB", "TH",
                           1079.7107, null, null, null, null,
                           null, null, null, null,
                           null, null, null, null));
             
             mapAirsellOD.put(2, new ODClass("TLBAST", 2, "BKK", startServiceDateTime2,
                           startServiceDate2,startServiceTime2,
                           "PNH", endServiceDateTime2,endServiceDate2,endServiceTime2,
                           "PG", "TH", "KH",
                           1079.7107, null, null, null, null,
                           null, null, null, null,
                           null, null, null, null));
             
             mapAirsellOD.put(3, new ODClass("TLBAST", 3, "PNH", startServiceDateTime3,
                           startServiceDate3,startServiceTime3,
                           "BKK", endServiceDateTime3,endServiceDate3,endServiceTime3,
                           "PG", "KH", "TH",
                           1079.7107, null, null, null, null,
                           null, null, null, null,
                           null, null, null, null));
             
             mapAirsellOD.put(4, new ODClass("TLBAST", 4, "BKK", startServiceDateTime4,
                           startServiceDate4,startServiceTime4,
                           "LHR", endServiceDateTime4,endServiceDate4,endServiceTime4,
                           "BA", "TH", "GB",
                           1079.7107, null, null, null, null,
                           null, null,null,null,
                           null, null,null,null));

     
     var resResFlight = new java.util.TreeMap[Integer,ODClass]
                  resResFlight=LogicClassOD.doLogic(mapAirsellOD)
               System.out.println("Out-----" +resResFlight )
  }

}