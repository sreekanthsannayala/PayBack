//package de.payback.utilities;
//
//
//import de.payback.utilities.CustomerInfo.Customer;
//import lombok.extern.java.Log;
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVRecord;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.Reader;
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//
//@Log
//public class CSVParserUtils {
//
//
//    private static final String PATH = System.getProperty("user.dir") + "/src/main/resources/testData/" ;
//
//    private CSVParserUtils() {
//    }
//
//    public static Customer getLoginCreds(String testCaseName)  {
//        Optional<CSVRecord> csvRecord = getFirstRecord("Customer.csv", testCaseName);
//        if (csvRecord.isPresent()) {
//            CSVRecord record = csvRecord.get();
//            return Customer.builder()
//                    .firstName(record.get("FirstName"))
//                    .lastName(record.get("LastName"))
//                    .address(record.get("Address"))
//                    .pincode(record.get("Pincode"))
//                    .place(record.get("Place"))
//                    .birthdayDate(record.get("BirthdayDate"))
//                    .birthMonth(record.get("BirthMonth"))
//                    .birthYear(record.get("BirthYear"))
//                    .build();
//
//
//        }
//         throw new NoDataPresentException();
//    }
//
//    private static Optional<CSVRecord> getFirstRecord(String csvName, String testCaseName) {
//        List<CSVRecord> records = parseRecords(csvName);
//        return records.parallelStream().filter(record -> record.get("TestName").equals(testCaseName)).findFirst();
//    }
//
//    private static List<CSVRecord> parseRecords(String fileName) {
//        Reader in = null;
//        try {
//            in = new FileReader(PATH + fileName);
//            return CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in).getRecords();
//        } catch (IOException e) {
//            return Collections.emptyList();
//        }
//    }
//}
