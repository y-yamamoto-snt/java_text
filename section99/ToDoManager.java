import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task{
    String task_name;
    boolean is_done;

    Task(String task_name){
        this.task_name = task_name;
        this.is_done = false;
    }
}

public class ToDoManager{
    List<Task> to_do_list = new ArrayList<Task>();

    public void run(){
        System.out.println("Launched ToDoManager !\r\n");
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("> ");
            String input_line = scanner.nextLine();

            String[] parts = input_line.trim().split(" ", 2);
            String command = parts[0];
            String arg = (parts.length > 1) ? parts[1] : "";


            if(command.equalsIgnoreCase("exit")){
                System.out.println("Good Bye!");
                break;
            }
            else if(command.equals("add")){
                if (parts.length != 2){
                    System.out.println("Please input 1 task name after \"add\" command.\r\n");
                    continue;
                }
                addTask(arg);
            }
            else if(command.equals("delete")){
                if (parts.length != 2){
                    System.out.println("Please input 1 task number after \"delete\" command.\r\n");
                    continue;
                }
                int task_number=0;
                try{
                    task_number = Integer.parseInt(arg);
                }
                catch(NumberFormatException ex){
                    System.out.println("Please input integer.\r\n");
                    continue;
                }
                if(task_number < 1 || task_number > to_do_list.size()){
                    System.out.println("Please input valid task number.\r\n");
                    continue;
                }

                deleteTask(task_number, true);
            }
            else if(command.equals("done")){
                if (parts.length != 2){
                    System.out.println("Please input 1 task number after \"done\" command.\r\n");
                    continue;
                }
                int task_number=0;
                try{
                    task_number = Integer.parseInt(arg);
                }
                catch(NumberFormatException ex){
                    System.out.println("Please input integer.\r\n");
                    continue;
                }
                if(task_number < 1 || task_number > to_do_list.size()){
                    System.out.println("Please input valid task number.\r\n");
                    continue;
                }
                doneTask(task_number);
            }
            else if(command.equals("clean")){
                cleanDoneTasks();
            }
            else if(command.equals("list")){
                showTasks();
            }
            else{
                System.out.println("Invalid Command Entererd\r\n");
            }
        }
        scanner.close();
        return;
    }

    void addTask(String task_name){
        Task new_task = new Task(task_name);
        to_do_list.add(new_task);
        System.out.println("Task added.\r\n");
    }

    void deleteTask(int task_number, Boolean is_logging_enabled){
        to_do_list.remove(task_number-1);
        if(is_logging_enabled){
            System.out.printf("Delete task %d\r\n\r\n", task_number);    
        }
    }
    
    void doneTask(int task_number){
        to_do_list.get(task_number-1).is_done = true;
        System.out.printf("Task %d done.\r\n\r\n", task_number);
    }
    
    void showTasks(){
        if(to_do_list.size()==0){
            System.out.println("No tasks are registered.\r\n");
        }
        else{
            for(int task_i=0; task_i<to_do_list.size(); task_i++){
                String is_done_mark = (to_do_list.get(task_i).is_done) ? "x" : " ";
                System.out.printf("%d. [%s] %s\r\n", task_i+1, is_done_mark, to_do_list.get(task_i).task_name);
            }
            System.out.println();
        }
    }

    void cleanDoneTasks(){
        if(to_do_list.size()==0){
            System.out.println("No tasks are registered.\r\n");
        }
        else{
            for(int task_i=to_do_list.size()-1; task_i>=0; task_i--){
                Boolean is_done = to_do_list.get(task_i).is_done;
                if(is_done){
                    deleteTask(task_i+1, false);
                }
            }
            System.out.println("Deleted done tasks.\r\n");
        }
    }

}