import java.io.IOException;
import java.util.Arrays;

import controllers.ControllerImpl;
import interfacesOnlineShop.CommandType;
import interfacesOnlineShop.Controller;
import interfacesOnlineShop.Engine;
import interfacesOnlineShop.InputReader;
import onlineShop.OutputWriter;

public class EngineImpl implements Engine {

	 private InputReader reader;
	    private OutputWriter writer;
	    private Controller controller = new ControllerImpl();

	    public EngineImpl() {
	        // this.controller = new ControllerImpl();   //TODO Implement first
	        this.reader = new Reader();
	        this.writer = new Writer();
	    }

	    @Override
	    public void run() {
	        while (true) {
	            String result = null;
	            try {
	                result = processInput();

	                if ("Close".equals(result)) {
	                    break;
	                }

	            } catch (IOException | IllegalArgumentException | NullPointerException e) {
	                result = e.getMessage();
	            }

	            this.writer.writeLine(result);
	        }
	    }
	    private String processInput() throws IOException {
	        String input = this.reader.readLine();
	        String[] tokens = input.split("\\s");

	        CommandType command = CommandType.valueOf(tokens[0]);
	        String[] data = Arrays.stream(tokens).skip(1).toArray(String[]::new);
	         switch (command) { // TODO Implement first
            case AddComputer:
                return this.controller.addComputer(data[0], Integer.parseInt(data[1]), data[2], data[3], Double.parseDouble(data[4]));
            case AddPeripheral:
                return this.controller.addPeripheral(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], data[3], data[4], Double.parseDouble(data[5]), Double.parseDouble(data[6]), data[7]);
            case RemovePeripheral:
                return this.controller.removePeripheral(data[0], Integer.parseInt(data[1]));
            case AddComponent:
                return this.controller.addComponent(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], data[3], data[4], Double.parseDouble(data[5]), Double.parseDouble(data[6]), Integer.parseInt(data[7]));
            case RemoveComponent:
                return this.controller.removeComponent(data[0], Integer.parseInt(data[1]));
            case BuyComputer:
                return this.controller.buyComputer(Integer.parseInt(data[0]));
            case BuyBestComputer:
                return this.controller.BuyBestComputer(Double.parseDouble(data[0]));
            case GetComputerData:
                return controller.getComputerData(Integer.parseInt(data[0]));
            case Close:
                return "Close";
        }
         
	        
	        return null;
	    }

}
