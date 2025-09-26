export default function VariousInputs() {
    return (
        <div>
            <p>VariousInputs</p>
            <div>
                <input type="text" placeholder="Enter Some Texts" />
                <input type="password" placeholder="Enter Your Password" />
                <input type="email" placeholder="Enter E-mail Address" />
                <input type="range" />
                <input type="button" value="I'm A Button" />
                <input type="checkbox" value="I'm a checkbox" defaultChecked />
                <input type="radio" value="I'm A Radio" defaultChecked />
                <input type="file" />
            </div>
        </div>
    )
}