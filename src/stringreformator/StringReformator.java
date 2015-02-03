/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreformator;
import java.io.*;
import java.util.*;

/**
 *
 * @author kanis_000
 */
public class StringReformator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try{
            System.out.println(System.getProperty("user.dir"));
            List<String> inputs= new <String>ArrayList();
            //Reading downloaded file
            File newFile=new File("testdata.txt");
            FileReader fileReader=new FileReader(newFile);
            BufferedReader reader=new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
             inputs.add(line);
            }
            PrintWriter out= new PrintWriter(new FileWriter("out.txt"));
            for(int i=0;i<inputs.size();i++){
             StringTokenizer str=new StringTokenizer(inputs.get(i),"\t");
             out.println(str.nextToken());
            }
            out.close();
            /*
            //Creating new Object to handle this string
            StringBuilder output=new StringBuilder();
            Bioinformatics3 newText=new Bioinformatics3();
            int sourcenode=Integer.parseInt(inputs.get(0).toString());
            int sinknode=Integer.parseInt(inputs.get(1).toString());
            int maxnode=0;
            for(int i=2;i<inputs.size();i++){
                StringTokenizer fullString=new StringTokenizer(inputs.get(i).toString(),"->");
                int parentNodeValue=Integer.parseInt(fullString.nextToken());
                StringTokenizer childString=new StringTokenizer(fullString.nextToken(),":");
                int childNodeValue=Integer.parseInt(childString.nextToken());
                if(childNodeValue>maxnode){
                    maxnode=childNodeValue;
                }
                if(parentNodeValue>maxnode){
                    maxnode=parentNodeValue;
                }
            }
            node[] allnodes=new node[maxnode+1];
            for(int i=0;i<=maxnode;i++){
                allnodes[i]=new node(i);
            }
            
            edge.allnodes=allnodes;
            node.allnodes=allnodes;
            List alledges=new ArrayList();
            for(int i=2;i<inputs.size();i++){
                alledges.add(new edge(inputs.get(i).toString())); 
            }
            
            List<node> nodes=Bioinformatics3.toList(allnodes);
            
            nodes=newText.stripEverythingButTheCore(nodes,maxnode,sinknode,sourcenode);
 
            List<node> adjacencyList=newText.getAdjacencyList(nodes);
            for(int i=0;i<adjacencyList.size();i++){
                System.out.println(adjacencyList.get(i).getNodeNumber());
            }

            //Repopulating nodes:
            alledges=new ArrayList();
            for(int i=2;i<inputs.size();i++){
                alledges.add(new edge(inputs.get(i).toString())); 
            }
            nodes=Bioinformatics3.toList(edge.allnodes);
            nodes=newText.stripEverythingButTheCore(nodes,maxnode,sinknode,sourcenode);
            
            for(int i=0;i<nodes.size();i++){
                if(nodes.get(i).getParents().isEmpty()){
                    nodes.get(i).setScore(0);
                }
            }
            
            /*
            int count=0;
            for(int i=0;i<nodes.size();i++){
                if(nodes.get(i).getParents().isEmpty())
                    count++;
            }
            
            System.out.println(count);
            *//*
            node currentNode=null;
            
            for(int i=0;i<adjacencyList.size();i++){
                adjacencyList.get(i).computeScores();
                System.out.println(adjacencyList.get(i).getScore());
                if(adjacencyList.get(i).getNodeNumber()==sinknode){
                    currentNode=adjacencyList.get(i);
                }
            }
            out.println(currentNode.getScore());

            List<node> backtrack=new <node>ArrayList();
            backtrack.add(currentNode);

            while(!currentNode.getParents().isEmpty()){
                     node[] parents=new node[currentNode.getParents().size()];
                     for(int i=0;i<currentNode.getParents().size();i++){
                         parents[i]=(node)currentNode.getParents().get(i);
                         int score=parents[i].getScore()+currentNode.getEdge(parents[i]).getWeight();
                         if(currentNode.getScore()==score){
                             backtrack.add(parents[i]);
                             currentNode=parents[i];
                             break;
                         }
                     }
             }
                     
            out.print(backtrack.get(backtrack.size()-1).getNodeNumber());
            for(int i=backtrack.size()-2;i>=0;i--){
                out.print("->");
                out.print(backtrack.get(i).getNodeNumber());
            }
            
            */
        }
        
        
        catch(Exception e)
        {
         e.printStackTrace();
        }
        // TODO code application logic here
    }
    
}
